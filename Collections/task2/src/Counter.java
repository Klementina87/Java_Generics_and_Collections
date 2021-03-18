import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer> counts = new HashMap<>();



            /* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/

    public Counter(E[] things){
        for (int i = 0; i < things.length; i++) {
            if (counts.containsKey(things[i])) {
                int value = counts.get(things[i]);
                value += 1;
                counts.put(things[i], value);
            }

            else {
                counts.put(things[i], 1);
            }
        }

/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
    }

    public Integer getCount(E element){
         return counts.get(element);

        /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
    }

    public int getSize()
    {
        return this.counts.size();
    }

    public E mostFrequent(){
        E key = null;
        int value = 0;
        for (Map.Entry<E, Integer> element : counts.entrySet()) {
            if (element.getValue() > value) {
                key = element.getKey();
                value = element.getValue();
            }
        }
        return key;
/* TODO 
Returns the most frequent key in the HashMap*/
    }
}
