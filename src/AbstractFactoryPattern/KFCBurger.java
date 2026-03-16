package AbstractFactoryPattern;

public class KFCBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparing kfc burger");
    }

    @Override
    public void eat() {
        System.out.println("eating kfc burger");
    }
}
