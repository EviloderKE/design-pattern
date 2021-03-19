package obServer;

/**
 * 观察者
 */
public interface ObServer {

    void update(float temp, float humidity, float pressure);

}
