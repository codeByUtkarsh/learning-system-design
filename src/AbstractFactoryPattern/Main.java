package AbstractFactoryPattern;

public class Main {
    public static void main(String args[]){
        MealFactory mealFactoryObj = new McDonaldFactory();
        Burger burger = mealFactoryObj.createBurger();
        Fries fries = mealFactoryObj.createFries();
        burger.prepare();
        fries.prepare();
        burger.eat();
        fries.eat();
    }
}
