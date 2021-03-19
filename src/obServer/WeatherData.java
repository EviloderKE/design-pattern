package obServer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private final ArrayList<ObServer> obServers;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData(){
        obServers = new ArrayList<>();
    }

    @Override
    public void registerObServer(ObServer obServer) {
        obServers.add(obServer);
    }

    @Override
    public void removeObServer(ObServer obServer) {
        obServers.remove(obServer);
    }

    @Override
    public void notifyObServers() {
        for (ObServer o: obServers) {
            o.update(temp, humidity, pressure);
        }
    }

    /**
     * 通知观察者
     */
    public void changed(){
        notifyObServers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        changed();
    }
}
