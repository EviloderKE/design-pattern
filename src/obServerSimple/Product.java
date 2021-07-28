package obServerSimple;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

    private float price;

    private List<ObServer> obServerList = new ArrayList<>();

    public void setPrice(float price) {
        this.price = price;
        notifyObServer();
    }

    @Override
    public void registerObServer(ObServer obServer) {
        obServerList.add(obServer);
    }

    @Override
    public void removeObServer(ObServer obServer) {
        obServerList.remove(obServer);
    }

    @Override
    public void notifyObServer() {
        for (ObServer ob: obServerList) {
            ob.update(price);
        }
    }
}
