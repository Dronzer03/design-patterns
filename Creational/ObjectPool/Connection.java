public class Connection {
    private boolean inUse;

    public Connection() {
        this.inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
