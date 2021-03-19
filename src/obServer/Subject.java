package obServer;

/**
 * 主题
 */
public interface Subject {

    void registerObServer(ObServer obServer);

    void removeObServer(ObServer obServer);

    void notifyObServers();
}
