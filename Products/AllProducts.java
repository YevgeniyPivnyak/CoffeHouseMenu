package Products;

import Ingredients.AllIngredients;

public class AllProducts {
    private String ProductName;

    AllIngredients[] ingredients = new AllIngredients[100];

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String name) {
        this.ProductName = name;
    }

    public String constituentsOf() {
        String constituentsOf = "";
        for (int i = 0; i < ingredients.length && ingredients[i] != null; i++) {
            constituentsOf = constituentsOf + ingredients[i].getNemeIngredient() + " + ";
        }
        return constituentsOf;
    }

    public int totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < ingredients.length && ingredients[i] != null; i++) {
            totalPrice += ingredients[i].getPriseIngredient() * ingredients[i].getPortion();
        }
        return totalPrice;
    }

}
