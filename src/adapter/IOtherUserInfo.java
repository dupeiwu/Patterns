package adapter;

import java.util.Map;

public interface IOtherUserInfo {

    Map<String,UserBaseInfo> getUserBaseInfo();
    Map<String,UserHomeInfo> getUserHomeInfo();
    Map<String,UserOfficeInfo> getUserOfficeInfo();
}