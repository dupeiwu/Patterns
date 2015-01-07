package factory_method;

public class Ultra_Edit implements IEdit{

    private String name="����Ultra_Edit";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openEdit() {
        System.out.println("��Ultra_Edit");
    }

    @Override
    public void closeEdit() {
        System.out.println("�ر�Ultra_Edit");
    }

    @Override
    public void uninstall() {
        System.out.println("ж��Ultra_Edit");
    }
}
