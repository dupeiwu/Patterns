package facade;

public class facade_client {

    public static void main(String[] args) {
        
        Letter letter=new Letter("����","����","��˿���","jintian");
        Envelope envelope=new Envelope("����ʡ","����","021", "����","����ʡ");
        Letter_Process letter_Process=new Letter_Process_Impl();
        LetterManager letterManager=new LetterManager();
        letterManager.sendLetter(letter_Process, letter, envelope);
    }

}
