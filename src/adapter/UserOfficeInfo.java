package adapter;

import java.util.HashMap;
import java.util.Map;

public class UserOfficeInfo {

    private String userPhone;
    private Map<String,UserOfficeInfo> map;
    
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public UserOfficeInfo(String userPhone) {
        this.userPhone = userPhone;
    }

    public Map<String, UserOfficeInfo> getMap() {
        return map;
    }

    public void setMap(Map<String, UserOfficeInfo> map) {
        this.map = map;
    }

    public UserOfficeInfo() {
        map=new HashMap<String, UserOfficeInfo>();
        map.put("1",new UserOfficeInfo("办公电话1"));
        map.put("2",new UserOfficeInfo("办公电话2"));
        map.put("3",new UserOfficeInfo("办公电话3"));
    }
    
}
