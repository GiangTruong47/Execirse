package B9.TemplateMethod;

public class HamburgerMeal extends Meal {

    public void prepareIngredients(){
        System.out.println("Getting burgers, buns, and frech fries");
    }

    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
}
