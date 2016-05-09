package Products;


import Ingredients.BlackTeaLeaf;
import Ingredients.GreenTeaLeaf;
import Ingredients.Water;

public class GreenTea extends AllProducts {
    public GreenTea() {
        setProductName("GreenTea");
        ingredients[0] = new Water();
        ingredients[1] = new GreenTeaLeaf();
        ingredients[1].setPortion(2);
    }
}
