import java.util.Objects;

public abstract class Handler {
    private Handler nextHandler;

    public abstract boolean handle(String userName, String password);

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public boolean handleNext(String userName, String password) {
        if (Objects.isNull(nextHandler))
            return true;
        return nextHandler.handle(userName, password);
    }
}
