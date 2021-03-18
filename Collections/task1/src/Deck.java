import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {

            this.deck=new ArrayList<>();
            for (String suit : suits) {
            for (int i = 2; i <= 10; i++)
                deck.add(new Card<Integer, String>(i, suit));
            deck.add(new Card<String, String>("Ace", suit));
            deck.add(new Card<String, String>("Jack", suit));
            deck.add(new Card<String, String>("Queen", suit));
            deck.add(new Card<String, String>("King", suit));
                }
        /*deck = new ArrayList<Card>();

        String[] cardValue = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < cardValue.length; j++) {
                String value = cardValue[j];
                String suit = suits[i];
                Card<String, String> card = new Card<>(value, suit);
                deck.add(card);

            }
        }*/
    }
/* TODO 
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/


    public Card dealCard(){
        int index = (int)Math.floor(Math.random()*(deck.size()));

        if (deck.size() > 0)
        {
            //System.out.println(deck.size());
            Card c = deck.get(index);
            deck.remove(index);

            return c;
        }

        return null;
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
    }

    public int size(){
    return deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
    return new DeckIterator<Card>(this);
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
    }
}
