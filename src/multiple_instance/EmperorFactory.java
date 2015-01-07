package multiple_instance;

import java.util.HashMap;
import java.util.Map;

public class EmperorFactory {

    private static final int countMap=2;
    public static final String ROBBY="robby";
    public static final String TONY="tony";
    private static final Map<String,Emperor> MAP=new HashMap<String, Emperor>(countMap);
    
    static 
    {
          MAP.put("robby",new Emperor("�ʵۣ�robby"));
          MAP.put("tony",new Emperor("�ʵۣ�tony"));
    }
    
    private EmperorFactory(){}
    
    public static Emperor getEmperor(String key)
    {
        return MAP.get(key);
    }
}
