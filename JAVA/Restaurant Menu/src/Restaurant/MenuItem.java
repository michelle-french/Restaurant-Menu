package Restaurant;


public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String itemName, double price, String description, String category, boolean isNew) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Can tell if MenuItem is new
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    // #TODO Can print out a MenuItem and Menu
    @Override
    public String toString(){
        return this.itemName + " $" + this.price + " Description: " + this.description + " " + this.category;
    }

    // #TODO If two MenuItems are equal
    @Override
    public boolean equals(Object otherItem) {
        if(this == otherItem){
            return true;
        }
        if(otherItem == null){
            return false;
        }
        if(this.getClass() != otherItem.getClass()){
            return false;
        }
        MenuItem otherMenuItem = (MenuItem) otherItem;
        return this.itemName.equals(otherMenuItem.getItemName());
    }
}


