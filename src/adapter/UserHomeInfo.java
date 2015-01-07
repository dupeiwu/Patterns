package adapter;

import java.util.HashMap;
import java.util.Map;

public class UserHomeInfo {

    private String userAddress;
    private Map<String,UserHomeInfo> map;
    
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public UserHomeInfo(String userAddress) {
        this.userAddress = userAddress;
    }

    public Map<String, UserHomeInfo> getMap() {
        return map;
    }

    public void setMap(Map<String, UserHomeInfo> map) {
        this.map = map;
    }

    public UserHomeInfo() {
        map=new HashMap<String, UserHomeInfo>();
        map.put("1",new UserHomeInfo("µÿ÷∑1"));
        map.put("2",new UserHomeInfo("µÿ÷∑2"));
        map.put("3",new UserHomeInfo("µÿ÷∑3"));
    }
    
}
