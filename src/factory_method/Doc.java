package factory_method;

public class Doc implements IDocument{

    private String name="����Doc�ı�";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openDocument() {
        System.out.println("��Doc�ı�");
    }

    @Override
    public void saveDocument() {
        System.out.println("����Doc�ı�");
    }

    @Override
    public void closeDocument() {
        System.out.println("�ر�Doc�ı�");
    }

    @Override
    public void deleteDocument() {
        System.out.println("ɾ��Doc�ı�");
    }
}
