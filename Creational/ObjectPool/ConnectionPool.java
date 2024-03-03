import java.util.HashMap;
import java.util.Map;

public class ConnectionPool {
    private static final int POOL_SIZE = 5;
    private Map<Integer, Connection> pool;

    public ConnectionPool() {
        pool = new HashMap<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.put(i, new Connection());
        }
    }

    public synchronized Connection acquireConnection(int key) {
        Connection connection = pool.get(key);
        if (connection != null && !connection.isInUse()) {
            connection.setInUse(true);
            return connection;
        }
        return null; // No available connection with the given key
    }

    public synchronized void releaseConnection(int key) {
        Connection connection = pool.get(key);
        if (connection != null) {
            connection.setInUse(false);
        }
    }

    public synchronized boolean isConnectionAvailable() {
        for (Map.Entry<Integer, Connection> entry : pool.entrySet()) {
            if (!entry.getValue().isInUse()) {
                return true;
            }
        }
        return false;
    }
}
