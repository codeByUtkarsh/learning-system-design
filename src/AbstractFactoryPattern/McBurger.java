package AbstractFactoryPattern;

public class McBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("preparing mc burger");
    }

    @Override
    public void eat() {
        System.out.println("eating mc burger");
    }
}
