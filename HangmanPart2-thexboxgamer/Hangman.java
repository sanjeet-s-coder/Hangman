import java.util.Scanner;  

public class Hangman{
  private String secret;
  private String display;
  private int wrongGuesses;
  private String guess;
  public Hangman(){
    secret=chooseRandomWord();
    display="?????";
  }
  public String chooseRandomWord(){
    return "raise";
  }
  public void makeGuess(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a letter: ");
    guess=scan.nextLine();
    int spot = secret.indexOf(guess);
    if(secret.indexOf(guess)!=-1){
        display=display.substring(0,spot)+guess+display.substring(spot+1);
    }
    else{
      wrongGuesses++;
      System.out.println("Nope " + wrongGuesses + " bad guess");
    }
    System.out.println(display);
  }
  public int getNumWrongGuesses(){
    return wrongGuesses;
  }
  
}