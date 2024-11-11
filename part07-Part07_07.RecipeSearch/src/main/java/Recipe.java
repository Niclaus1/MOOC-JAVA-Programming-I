import java.util.ArrayList;

public class Recipe{
    private String foodName;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(String food, int time){
        this.foodName = food;
        this.cookTime = time;
        this.ingredients = new ArrayList<>();
    }

    public String getFoodName(){
        return foodName;
    }

    public int cookTime(){
        return cookTime;
    }

    public void addIngredients(String ingredient){
        ingredients.add(ingredient);
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return foodName + ", " + "cooking time: " + cookTime;
    }
}