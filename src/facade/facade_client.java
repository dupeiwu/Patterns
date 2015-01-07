package facade;

public class facade_client {

    public static void main(String[] args) {
        
        Letter letter=new Letter("张三","标题","丽丝你好","jintian");
        Envelope envelope=new Envelope("李四省","李四","021", "张三","张三省");
        Letter_Process letter_Process=new Letter_Process_Impl();
        LetterManager letterManager=new LetterManager();
        letterManager.sendLetter(letter_Process, letter, envelope);
    }

}
