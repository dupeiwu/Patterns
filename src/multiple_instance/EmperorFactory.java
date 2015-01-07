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
          MAP.put("robby",new Emperor("»ÊµÛ£ºrobby"));
          MAP.put("tony",new Emperor("»ÊµÛ£ºtony"));
    }
    
    private EmperorFactory(){}
    
    public static Emperor getEmperor(String key)
    {
        return MAP.get(key);
    }
}
