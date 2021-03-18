public class BingoChip<T,I> {
    private T letter;
    private I number;

    public BingoChip (T letter, I number) {

        this.letter = letter;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chip: " + letter.toString() + "-" + number.toString();
    }



}