package logic;

import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingredients;
    private String instructions;
    private String imgURL;

    public Recipe(String instructions, String imgURL) {
        this.instructions = instructions;
        this.imgURL = imgURL;    
        ingredients = new ArrayList<>();
    }
    
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
    
}
