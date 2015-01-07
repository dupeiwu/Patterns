package facade;

public class Letter_Process_Impl implements Letter_Process {

    @Override
    public void writeLetter(Letter letter) {
        System.out.println("д��--------------------------------");
        System.out.println("д���ˣ�"+letter.getWrite_name());
        System.out.println("���⣺"+letter.getTitle());
        System.out.println("���ݣ�"+letter.getContent());
        System.out.println("���ڣ�"+letter.getDate());
    }

    @Override
    public void writeEnvelope(Envelope envelope) {
        System.out.println("д�ŷ�--------------------------------");
        System.out.println("�����ˣ�"+envelope.getPost_name());
        System.out.println("���ŵ�ַ��"+envelope.getPost_address());
        System.out.println("�����ˣ�"+envelope.getWrite_name());
        System.out.println("���ŵ�ַ��"+envelope.getWrite_address());
        System.out.println("�ʱࣺ"+envelope.getZip_code());
    }

    @Override
    public void putInEnvelope() {
        System.out.println("װ�ŷ�-------------------------------");
    }

    @Override
    public void sendLetter() {
        System.out.println("�ʼ���-------------------------------");
    }

}
