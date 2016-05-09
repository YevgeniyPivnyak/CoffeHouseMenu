package Products;


import Ingredients.GroundCoffee;
import Ingredients.Milk;
import Ingredients.Water;

public class Americano extends AllProducts {
    public Americano() {
        setProductName("Americano");
        ingredients[0] = new Water();
        ingredients[1] = new GroundCoffee();
        ingredients[3] = new Milk();
        ingredients[3].setPortion(1);
    }
}
