package AbstractFactoryPattern;

public class McFries implements Fries{

    @Override
    public void prepare() {
        System.out.println("Preparing mc fries");
    }

    @Override
    public void eat() {
        System.out.println("eating mc fries");
    }
}
