package obServerJDK;

public class App {

    public static void main(String[] args) {
        Product product = new Product();

        People zk = new People("zk");
        People zk1 = new People("zk1");
        product.addObserver(zk);
        product.addObserver(zk1);

        product.setChanged();
        product.notifyObservers(40);

        product.deleteObserver(zk);
        product.setChanged();
        product.notifyObservers(30);
    }
}
