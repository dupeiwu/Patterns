package adapter;

import java.util.HashMap;
import java.util.Map;

public class UserBaseInfo {

    private String userName;
    private Map<String,UserBaseInfo> map;
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserBaseInfo(String userName) {
        this.userName = userName;
    }

    public Map<String, UserBaseInfo> getMap() {
        return map;
    }

    public void setMap(Map<String, UserBaseInfo> map) {
        this.map = map;
    }

    public UserBaseInfo() {
        map=new HashMap<String, UserBaseInfo>();
        map.put("1",new UserBaseInfo("Ãû×Ö1"));
        map.put("2",new UserBaseInfo("Ãû×Ö2"));
        map.put("3",new UserBaseInfo("Ãû×Ö3"));
    }
    
}
