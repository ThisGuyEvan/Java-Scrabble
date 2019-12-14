import java.util.Scanner;



class Main {
  public static void main(String[] args) {
    boolean run = true;
    while (run){
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter a word");
      String word = userInput.next();

      System.out.println("\nEnter your string");
      String str = userInput.next();

      System.out.println("Result:  " + Scrabble(word, str));

      System.out.println("Restart [y, other]");
      String answer = userInput.next();
      answer = answer.toLowerCase();

      if (answer.equals("y")){
      }
      else{
        break;
      }

    }

  }

  public static boolean Scrabble(String word, String str){
    boolean test = true;

    StringBuilder build = new StringBuilder();//Initializing a variable for the rebullding of the word.

    String newWord;
    char letter;

    for (int i = 0; i < word.length(); i++){
      letter = word.charAt(i);

      if (str.indexOf(letter) < 0){return false;}
      else{
        build.append(String.valueOf(str.charAt(str.indexOf(letter))));
        System.out.println(build);
        word = word.remove(String.valueOf(letter));
      }
    }



    return test;

  }
}