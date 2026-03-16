package AbstractFactoryPattern;

public class McDonaldFactory implements MealFactory{

    @Override
    public Burger createBurger() {
        return new McBurger();
    }

    @Override
    public Fries createFries() {
        return new McFries();
    }
}
