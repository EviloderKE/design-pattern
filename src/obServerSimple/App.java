package obServerSimple;

public class App {
    public static void main(String[] args) {
        People zk = new People("zk");

        People zk1 = new People("zk1");

        Product product = new Product();
        product.registerObServer(zk);
        product.registerObServer(zk1);

        product.setPrice(50);

        product.removeObServer(zk);
        product.setPrice(30);

    }
}
