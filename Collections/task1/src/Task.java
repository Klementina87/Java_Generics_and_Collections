import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card card: d) {
            System.out.println(card.toString());
        }

    }

    public static int addCards(ArrayList<Card> hand){
        int sum = 0;

        for (int i = 0; i < hand.size(); i++) {
            String value =  hand.get(i).getValue().toString();
            if (value.equals("Ace"))
                sum += 1;
            else if  (value.equals("Jack"))
            {
              sum += 11;
            }
            else if  (value.equals("Queen"))
            {
                sum += 12;
            }
            else if  (value.equals("King"))
            {
                sum += 13;
            }
            else
                sum += Integer.parseInt(value);

        }

        return sum;
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
    }
}