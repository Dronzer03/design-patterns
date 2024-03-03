public class ConnectionPoolClient {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();

        Connection connection1 = null;
        Connection connection2 = null;

        if (connectionPool.isConnectionAvailable()) {
            connection1 = connectionPool.acquireConnection(0);
            connection2 = connectionPool.acquireConnection(1);
        }

        if (connection1 != null && connection2 != null) {
            System.out.println("Connections acquired and in use.");

            connectionPool.releaseConnection(0);
            System.out.println("Connections released back to the pool.");
        }
    }
}
