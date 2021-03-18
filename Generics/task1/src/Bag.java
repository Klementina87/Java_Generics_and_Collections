import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
       objects = new ArrayList<>();
        /* TODO
Initialize the objects variable*/
    }
    public void add (T object) throws BagException{

        /*if (object != null)
            objects.add(object);
        else
            throw new BagException("Cannot add null to a Bag");*/

        if(object==null)
            throw new BagException("Nulls are not allowed");
        objects.add(object);
    }
    /* TODO
code the add method described. It should be public and not 
return anything. Just take in a parameter and  throw an 
exception. Read the documentation for this.*/

    public T drawOne()  {
        //Random random = new Random();
        //int index = (int)Math.round(Math.random()*(objects.size()-1));
        //if (objects.size() == 0)
            //return null;
       //return objects.get(index);

            int index = (int)Math.round(Math.random()*(objects.size()-1));
        return objects.get(index);


    }
 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/

   public ArrayList<T> drawMany(int howMany)  {
        /*ArrayList<T> draw = new ArrayList<>(howMany);
        for (int i = 0; i < howMany; i++) {
           T result = this.drawOne();
           draw.add(result);
        }
        return draw;*/
       ArrayList<T> result = new ArrayList<>(howMany);
       for(int i=0;i<howMany;i++)
           result.add(this.drawOne());
       return result;
/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */
    }

    public void add(T element,double prob) throws BagException{
        /* TODO 
Check that the probability is between 0 and 1. Otherwise
throw an exception. */

        if (prob >= 1 || prob < 0)
            throw new BagException("Probability must be between 0 and 1");
        // This is a way to add elements in a given proportion.
        int tot = (int)Math.round(objects.size()*prob);
        for(int i = 0;i < tot; i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}


        /*int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++)
            if (prob > 0 || prob < 1) {
                System.out.println("Adding " + i);
                objects.add(element);

                throw new BagException("Probability should be between 0 and 1");
        }
    }
}*/



