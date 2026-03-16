package AbstractFactoryPattern;

public class KFCFries implements Fries{

    @Override
    public void prepare() {
        System.out.println("preparing kfc fries");
    }

    @Override
    public void eat() {
        System.out.println("eating kfc fries");
    }
}
