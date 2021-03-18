public class Task {
  public static void main(String[] args){
      Bag<Integer> numbers = new Bag<>();
      Bag<BingoChip> bingo = new Bag<>();
      try {
          numbers.add(1);
          numbers.add(2);
          numbers.add(2);
          numbers.add(1,0.8);
          numbers.add(2,0.9);
          System.out.println("Drawing 10 times, mostly twos");
          System.out.println(numbers.drawMany((10)));

          bingo.add(new BingoChip<String, Integer>("N",5),0.1);
          bingo.add(new BingoChip<String, Integer>("I",73),0.5);
          bingo.add(new BingoChip<String, String>("N","Center"),0.7);
          bingo.add(new BingoChip<String, Integer>("B",12),0.3);

          System.out.println("Draw a bingo chip");
          System.out.println(bingo.drawOne());
      }catch(BagException e){
          e.printStackTrace();
      }

  }

}