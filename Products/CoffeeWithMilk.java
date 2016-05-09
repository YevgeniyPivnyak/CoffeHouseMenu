package Products;


import Ingredients.GroundCoffee;
import Ingredients.Milk;
import Ingredients.Water;

public class CoffeeWithMilk extends AllProducts{
    public CoffeeWithMilk() {
        setProductName("CoffeeWithMilk");
        ingredients[0] = new Water();
        ingredients[1] = new GroundCoffee();
        ingredients[3] = new Milk();
        ingredients[3].setPortion(2);
    }
}
