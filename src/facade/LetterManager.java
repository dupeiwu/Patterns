package facade;

public class LetterManager {

    private String police="alon";
    
    public void sendLetter(Letter_Process letter_Process,Letter letter,Envelope envelope)
    {
        letter_Process.writeLetter(letter);
        letter_Process.writeEnvelope(envelope);
        checkLetter();
        letter_Process.putInEnvelope();
        letter_Process.sendLetter();
    }
    
    private void checkLetter()
    {
        System.out.println("¾¯²ì£º"+police+"¼ì²éÐÅ¼þ--------------------------");
    }
}
