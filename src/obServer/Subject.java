package obServer;

/**
 * 主题(被观察者)
 */
public interface Subject {

    void registerObServer(ObServer obServer);

    void removeObServer(ObServer obServer);

    void notifyObServers();
}
