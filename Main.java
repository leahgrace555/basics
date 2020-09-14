public class Main{
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(5);
  }

  public static String pluralize(String word, int num){
    if(num > 1){
      return word + "s";
    } else {
      return word;
    }
  }

  public static void flipNHeads(int n){
    int count = 0;
    int heads = 0;
    while(heads < n){
      double toss = Math.random();
      if(toss >= 0.5) {
        System.out.println("heads");
        heads++;
      } else {
        System.out.println("Tails");
        heads = 0;
      }
      count++;
    }
    System.out.println("It took " + count + " flips to flip " + n + " heads in a row." );
  }
}