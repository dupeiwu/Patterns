package factory_method;

public class Txt implements IDocument{

    private String name="����Txt�ı�";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openDocument() {
        System.out.println("��Txt�ı�");
    }

    @Override
    public void saveDocument() {
        System.out.println("����Txt�ı�");
    }

    @Override
    public void closeDocument() {
        System.out.println("�ر�Txt�ı�");
    }

    @Override
    public void deleteDocument() {
        System.out.println("ɾ��Txt�ı�");
    }
}
