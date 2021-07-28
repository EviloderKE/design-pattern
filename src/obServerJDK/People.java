package obServerJDK;

import java.util.Observable;
import java.util.Observer;

public class People implements Observer {

    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + ":" + arg);
    }
}
