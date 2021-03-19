package obServer;

public class OneDisplay implements ObServer, DisplayElement{

    private WeatherData weatherData;

    private float temp;

    private float humidity;

    public OneDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObServer(this);
    }

    @Override
    public void display() {
        System.out.println("temp is:" + temp + "humidity is:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
