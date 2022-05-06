package kk.it.model.mapper.operation;

public class UserDto {

    private String userName;
    private String userAddrs;
    private String city;
    private String dept;

    public UserDto() {
    }

    public UserDto(String userName, String userAddrs, String city, String dept) {
        this.userName = userName;
        this.userAddrs = userAddrs;
        this.city = city;
        this.dept = dept;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddrs() {
        return userAddrs;
    }

    public void setUserAddrs(String userAddrs) {
        this.userAddrs = userAddrs;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", userAddrs='" + userAddrs + '\'' +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
