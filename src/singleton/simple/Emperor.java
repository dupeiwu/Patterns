package singleton.simple;

public class Emperor {

    private static Emperor emperor=null;
    private Emperor(){}
    //可以通过加synchronized保证多线程下，仍然单例，但是效率比较低
    public static Emperor getEmperor()
    {
        if(emperor==null)
        {
            emperor= new Emperor();
        }
        return emperor;
    }
}
