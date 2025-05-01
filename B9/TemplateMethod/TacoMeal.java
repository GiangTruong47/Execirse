package B9.TemplateMethod;

public class TacoMeal extends Meal {
    public void prepareIngredients() {
        System.out.println("Gettong ground beef and shells");
    }

    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    public void eat() {
        System.out.println("The tacos are tasty");
    }

    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
}
