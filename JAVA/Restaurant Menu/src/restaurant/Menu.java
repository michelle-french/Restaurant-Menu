package Restaurant;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Can add and remove MenuItems from Menu
    public void addMenuItem(MenuItem newMenuItem){
        this.menuItems.add(newMenuItem);
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem menuItem){
        this.menuItems.remove(menuItem);
    }


    // Can tell when menu was last updated
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // Can print out a MenuItem and Menu

    @Override
    public String toString() {
        String returnString = "";
        for(MenuItem menuItem: this.menuItems){
            returnString = returnString + menuItem + "\n";
        }
        returnString = returnString + "Last updated: " + this.lastUpdated;
        return returnString;
    }
}