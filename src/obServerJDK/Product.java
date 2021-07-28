package obServerJDK;

import java.util.Observable;

public class Product extends Observable {

    private int price;

    public void setChanged(){
        super.setChanged();
    }
}
