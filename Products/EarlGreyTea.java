package Products;


import Ingredients.Bergamot;
import Ingredients.BlackTeaLeaf;
import Ingredients.Water;

public class EarlGreyTea extends AllProducts {
    public EarlGreyTea() {
        setProductName("EarlGreyTea");
        ingredients[0] = new Water();
        ingredients[1] = new BlackTeaLeaf();
        ingredients[2] = new Bergamot();
        ingredients[2].setPortion(2);
    }
}
