package logic;

import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private String instructions;

    public Recipe(String instructions) {
        this.instructions = instructions;
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
