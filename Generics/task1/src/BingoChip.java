public class BingoChip<T,T1> {
    private T letter;
    private T1 number;

    public BingoChip (T letter, T1 number) {

        this.letter = letter;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chip: " + letter.toString() + "-" + number.toString();
    }



}