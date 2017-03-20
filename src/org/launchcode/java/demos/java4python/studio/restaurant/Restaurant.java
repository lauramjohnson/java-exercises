package org.launchcode.java.demos.java4python.studio.restaurant;

/**
 * Created by Laura on 3/13/2017.
 */
public class Restaurant {
    public static void main(String[] args) {
        Menu menu = loadMenu();
        printMenu(menu);
        menu.removeItem("Brownie");
        printMenu(menu);
    }

    private static void printMenu(Menu menu) {
        System.out.println("Last Updated:  " + menu.getDateUpdated());
        for (MenuItem item : menu.getItems()) {
            System.out.println("************");
            System.out.println("Name:  " + item.getName());
            System.out.println("Category:  " + item.getCategory());
            System.out.println("Description:  " + item.getDescription());
            System.out.println("Price:  " + item.getPrice());
        }
    }

    private static Menu loadMenu() {
        Menu menu = new Menu();

        MenuItem Pizza = new MenuItem();
        Pizza.setName("Pepperoni Pizza");
        Pizza.setDescription("Pizza with cheese and pepperoni");
        Pizza.setCategory("Entree");
        Pizza.setPrice(12.99);
        menu.addItem(Pizza);

        MenuItem Breadsticks = new MenuItem();
        Breadsticks.setName("Breadsticks");
        Breadsticks.setDescription("Strips of homemade dough, dusted with parmesean and garlic butter");
        Breadsticks.setCategory("Appetizer");
        Breadsticks.setPrice(4.99);
        menu.addItem(Breadsticks);

        MenuItem Brownie = new MenuItem();
        Brownie.setName("Brownie");
        Brownie.setDescription("Chocolate brownie with fudge ripples and chocolate chips");
        Brownie.setCategory("Dessert");
        Brownie.setPrice(3.99);
        menu.addItem(Brownie);

        return menu;
    }
}

