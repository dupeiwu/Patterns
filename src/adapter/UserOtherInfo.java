package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserOtherInfo implements IUserInfo,IOtherUserInfo {

    private Map<String,UserBaseInfo> baseMap;
    private Map<String,UserHomeInfo> homeMap;
    private Map<String,UserOfficeInfo> officeMap;
   
    public UserOtherInfo() {
        getUserBaseInfo();
        getUserHomeInfo();
        getUserOfficeInfo();
    }

    @Override
    public Map<String, UserBaseInfo> getUserBaseInfo() {
        UserBaseInfo baseInfo=new UserBaseInfo();
        this.baseMap=baseInfo.getMap();
        return baseMap;
    }

    @Override
    public Map<String, UserHomeInfo> getUserHomeInfo() {
        UserHomeInfo homeInfo=new UserHomeInfo();
        this.homeMap=homeInfo.getMap();
        return homeMap;
    }

    @Override
    public Map<String, UserOfficeInfo> getUserOfficeInfo() {
        UserOfficeInfo officeInfo=new UserOfficeInfo();
        this.officeMap=officeInfo.getMap();
        return officeMap;
    }

    @Override
    public List<String> getUserNames() {
        List<String> list=new ArrayList<String>();
        for(String s:baseMap.keySet())
        {
            list.add(baseMap.get(s).getUserName());
            System.out.println("key:"+s+","+"name:"+baseMap.get(s).getUserName());
        }
        return list;
    }

    @Override
    public List<String> getUserAddresss() {
        List<String> list=new ArrayList<String>();
        for(String s:homeMap.keySet())
        {
            list.add(homeMap.get(s).getUserAddress());
            System.out.println("key:"+s+","+"address:"+homeMap.get(s).getUserAddress());
        }
        return list;
    }

    @Override
    public List<String> getUserPhones() {
        List<String> list=new ArrayList<String>();
        for(String s:officeMap.keySet())
        {
            list.add(officeMap.get(s).getUserPhone());
            System.out.println("key:"+s+","+"phone:"+officeMap.get(s).getUserPhone());
        }
        return list;
    }

    
}
 