package factory_method;

public class Ultra_Edit implements IEdit{

    private String name="我是Ultra_Edit";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openEdit() {
        System.out.println("打开Ultra_Edit");
    }

    @Override
    public void closeEdit() {
        System.out.println("关闭Ultra_Edit");
    }

    @Override
    public void uninstall() {
        System.out.println("卸载Ultra_Edit");
    }
}
