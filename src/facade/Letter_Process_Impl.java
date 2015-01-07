package facade;

public class Letter_Process_Impl implements Letter_Process {

    @Override
    public void writeLetter(Letter letter) {
        System.out.println("写信--------------------------------");
        System.out.println("写信人："+letter.getWrite_name());
        System.out.println("标题："+letter.getTitle());
        System.out.println("内容："+letter.getContent());
        System.out.println("日期："+letter.getDate());
    }

    @Override
    public void writeEnvelope(Envelope envelope) {
        System.out.println("写信封--------------------------------");
        System.out.println("收信人："+envelope.getPost_name());
        System.out.println("收信地址："+envelope.getPost_address());
        System.out.println("寄信人："+envelope.getWrite_name());
        System.out.println("寄信地址："+envelope.getWrite_address());
        System.out.println("邮编："+envelope.getZip_code());
    }

    @Override
    public void putInEnvelope() {
        System.out.println("装信封-------------------------------");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信-------------------------------");
    }

}
