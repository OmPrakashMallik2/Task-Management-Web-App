package TaskManagementWebApp.backend.Models;

import java.util.List;

public class Category {
    private Integer categoryId;
    private String categoryName;
    private List<Task> categories;

    public Category() {
    }

    public Category(Integer categoryId, String categoryName, List<Task> categories) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categories = categories;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Task> getCategories() {
        return categories;
    }

    public void setCategories(List<Task> categories) {
        this.categories = categories;
    }
}
