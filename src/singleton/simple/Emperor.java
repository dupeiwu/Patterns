package singleton.simple;

public class Emperor {

    private static Emperor emperor=null;
    private Emperor(){}
    //����ͨ����synchronized��֤���߳��£���Ȼ����������Ч�ʱȽϵ�
    public static Emperor getEmperor()
    {
        if(emperor==null)
        {
            emperor= new Emperor();
        }
        return emperor;
    }
}
