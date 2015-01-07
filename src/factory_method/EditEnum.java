package factory_method;

public enum EditEnum {

    note_pad("factory_method.Note_Pad"),
    ultra_edit("factory_method.Ultra_Edit");
    
    private String value;
    private EditEnum(String value){this.value=value;}
    
    public String getValue()
    {
        return this.value;
    }
}
