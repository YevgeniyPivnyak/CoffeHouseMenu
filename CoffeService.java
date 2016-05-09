import Products.*;
import Ingredients.*;

public class CoffeService {
    private AllProducts[] CoffeHouseMenu = new AllProducts[10];

    public CoffeService() {
        CoffeHouseMenu[0] = new Americano();
        CoffeHouseMenu[1] = new BlackCoffee();
        CoffeHouseMenu[2] = new BlackTea();
        CoffeHouseMenu[3] = new CoffeeWithMilk();
        CoffeHouseMenu[4] = new CoffeeWithMilk();
        CoffeHouseMenu[5] = new EarlGreyTea();
        CoffeHouseMenu[6] = new GreenTea();
        CoffeHouseMenu[7] = new Mokachino();
    }

    public void ShowCoffeHouseMenu() {
        for (int j = 0; (j < CoffeHouseMenu.length && CoffeHouseMenu[j] != null); j++) {
            System.out.println(CoffeHouseMenu[j].getProductName()
                    + " Constituents of: " + CoffeHouseMenu[j].constituentsOf()
                    + " Total price: " + CoffeHouseMenu[j].totalPrice() + "$.");
        }
    }
}
