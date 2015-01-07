package factory_method;

public class Note_Pad implements IEdit{

    private String name="我是Note_Pad";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openEdit() {
        System.out.println("打开Note_Pad");
    }

    @Override
    public void closeEdit() {
        System.out.println("关闭Note_Pad");
    }

    @Override
    public void uninstall() {
        System.out.println("卸载Note_Pad");
    }
    
    
}
