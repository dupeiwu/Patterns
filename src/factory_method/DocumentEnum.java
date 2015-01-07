package factory_method;

public enum DocumentEnum {

    txt("factory_method.Txt"),
    doc("factory_method.Doc");
    
    private String value;
    private DocumentEnum(String value){this.value=value;}
    
    public String getValue()
    {
        return this.value;
    }
}
