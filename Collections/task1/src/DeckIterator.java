import java.util.Iterator;

public class DeckIterator<E> implements Iterator<E> /* TODO
Implement the Iterator interface */ {

    Deck d;
    public DeckIterator(Deck d){
        this.d = d;
/* TODO
initialize the variable d */
    }

    @Override
    public boolean hasNext() {
        if (d.size() > 0)
            return true;
        return false;
       /* TODO
Return true if there are elements left in the Deck */
    }

    @Override
    public E next() {
        E e = (E)d.dealCard();
        return e;

        /* TODO
Deal a card and return it. */
    }
}
