package factory_method;

public class Note_Pad implements IEdit{

    private String name="����Note_Pad";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openEdit() {
        System.out.println("��Note_Pad");
    }

    @Override
    public void closeEdit() {
        System.out.println("�ر�Note_Pad");
    }

    @Override
    public void uninstall() {
        System.out.println("ж��Note_Pad");
    }
    
    
}
