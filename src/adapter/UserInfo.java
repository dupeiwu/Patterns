package adapter;

import java.util.List;

public class UserInfo implements IUserInfo {

    private String userName;
    private String userAddress;
    private String userPhone;
    
    
    public UserInfo(String userName, String userAddress, String userPhone) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    public UserInfo() {
    }

    @Override
    public List<String> getUserNames() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<String> getUserAddresss() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<String> getUserPhones() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    
}
