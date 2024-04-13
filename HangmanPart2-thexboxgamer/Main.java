class Main 
{
  public static void main(String[] args) 
  {
    
    Hangman mygame = new Hangman();
    mygame.chooseRandomWord();
    while(mygame.getNumWrongGuesses()<5){
      mygame.makeGuess();
    }
      
   
  }
}