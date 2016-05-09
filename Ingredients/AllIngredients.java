package Ingredients;


public class AllIngredients {
    private  String nemeIngredient;
    private  double priseIngredient;
    private int portion;

//    public AllIngredients(String nemeIngredient, int portion, double priseIngredient){
//        this.nemeIngredient = nemeIngredient;
//        this.portion = portion;
//        this.priseIngredient = priseIngredient;
//
//    }


    public String getNemeIngredient() {
        return nemeIngredient;
    }

    public void setNemeIngredient(String nemeIngredient) {
        this.nemeIngredient = nemeIngredient;
    }

    public double getPriseIngredient() {
        return priseIngredient;
    }

    public void setPriseIngredient(double priseIngredient) {
        this.priseIngredient = priseIngredient;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }
}
