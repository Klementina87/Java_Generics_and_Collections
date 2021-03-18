public class Card <V,S>{
    private V value;
    private S suit;

    public Card (V value, S suit) {
        this.value = value;
        this.suit = suit;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void  setSuit(S suit) {
        this.suit = suit;
    }

    public S getSuit() {
        return this.suit;
    }

    public V getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", suit=" + suit +
                '}';
    }

    /* TODO
Implement the constructor, getters and setters and toString */
}
