package factory_method;

public class Doc implements IDocument{

    private String name="我是Doc文本";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openDocument() {
        System.out.println("打开Doc文本");
    }

    @Override
    public void saveDocument() {
        System.out.println("保存Doc文本");
    }

    @Override
    public void closeDocument() {
        System.out.println("关闭Doc文本");
    }

    @Override
    public void deleteDocument() {
        System.out.println("删除Doc文本");
    }
}
