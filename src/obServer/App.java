package obServer;

public class App {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        OneDisplay oneDisplay = new OneDisplay(weatherData);

        weatherData.setMeasurements(1.0f, 2.0f, 3.0f);
    }
}
