package TaskManagementWebApp.backend.Models;

import java.util.List;

public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String name;
    private List<Category> categoryList;

    public User() {
    }

    public User(Integer userId, String userName, String password, String name, List<Category> categoryList) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.categoryList = categoryList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
