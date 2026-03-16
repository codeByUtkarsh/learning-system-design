package AbstractFactoryPattern;

public class KFCFactory implements MealFactory{
    @Override
    public Burger createBurger() {
        return new KFCBurger();
    }

    @Override
    public Fries createFries() {
        return new KFCFries();
    }
}
