package Products;


import Ingredients.BlackTeaLeaf;
import Ingredients.GroundCoffee;
import Ingredients.Water;

public class BlackTea extends AllProducts{
    public BlackTea() {
        setProductName("BlackTea");
        ingredients[0] = new Water();
        ingredients[1] = new BlackTeaLeaf();
    }
}
