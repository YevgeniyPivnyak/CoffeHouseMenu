package Products;


import Ingredients.GroundCoffee;
import Ingredients.Milk;
import Ingredients.Water;

public class BlackCoffee extends AllProducts{
    public BlackCoffee() {
        setProductName("BlackCoffee");
        ingredients[0] = new Water();
        ingredients[1] = new GroundCoffee();
        ingredients[1].setPortion(2);
    }
}
