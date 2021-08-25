package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
            // write your code here
            Menu ourMenu = new Menu();
            MenuItem taco = new MenuItem("Taco", 3.49, "Tasty taco", "Main", true);
            MenuItem iceCream = new MenuItem("Ice Cream", .24, "Yummy ice cream", "Whatever", false);

            ourMenu.addMenuItem(taco);
            ourMenu.addMenuItem(iceCream);

            System.out.println(ourMenu);

    }


}
