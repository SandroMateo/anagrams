import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.print("Enter a sentence and we'll let you know if there are any anagrams in it:");
    String userInputSentence = console.readLine();
    Anagrams anagramFinder = new Anagrams(userInputSentence);

    System.out.println("These words are anagrams of each other:");
    System.out.println(anagramFinder.runAnagrams());
  }
}
