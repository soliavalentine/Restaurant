public class Menuitem {
    private Ingredient[] ingredients = new Ingredient[10];
    private String name;
    private int ingredientCount=0;
    private int prepTime;
    public Menuitem(String name, Ingredient[] ingredients,int prepTime){
    this.name = name;
    this.ingredients=ingredients;
    this.prepTime=prepTime;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
    public void addingIngredient(Ingredient i){
        ingredients[ingredientCount]= i;
        ingredientCount++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getItemPrice(){
        int count = 0;
        for(int i = 0; i<ingredients.length;i++){
            count+=ingredients[i].getPrice();
        }
        return count;
    }
    public int getPrepTime(){
        return prepTime;
    }
    public void setPrepTime(int time){
        this.prepTime=time;
    }
}
