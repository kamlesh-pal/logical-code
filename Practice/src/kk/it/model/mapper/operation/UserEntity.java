package kk.it.model.mapper.operation;

public class UserEntity {
    private int id;
    private String userName;
    private String userAddrs;
    private String userCity;
    private String userDepartment;

    public UserEntity(int id, String userName, String userAddrs, String userCity, String userDepartment) {
        this.id = id;
        this.userName = userName;
        this.userAddrs = userAddrs;
        this.userCity = userCity;
        this.userDepartment = userDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }
}
