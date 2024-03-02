import java.util.Objects;

public class DoubleLocking {
    private static DoubleLocking doubleLocking;

    private DoubleLocking() {}

    public static DoubleLocking getInstance() {
        if (Objects.isNull(doubleLocking)) {
            synchronized (DoubleLocking.class) {
                if (Objects.isNull(doubleLocking)) {
                    doubleLocking = new DoubleLocking();
                }
            }
        }
        return doubleLocking;
    }
}
