package factory_method;

public class Txt implements IDocument{

    private String name="我是Txt文本";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void openDocument() {
        System.out.println("打开Txt文本");
    }

    @Override
    public void saveDocument() {
        System.out.println("保存Txt文本");
    }

    @Override
    public void closeDocument() {
        System.out.println("关闭Txt文本");
    }

    @Override
    public void deleteDocument() {
        System.out.println("删除Txt文本");
    }
}
