package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    //should get array element by number choice or string to set category??
    private Double price;
    private Boolean isNew;

    public MenuItem(String name, String description, String category, Double price, Boolean isNew) {

        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return this.category;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = true;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return this.price;
    }

}


