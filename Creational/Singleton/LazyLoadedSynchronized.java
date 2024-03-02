import java.util.Objects;

public class LazyLoadedSynchronized {
    private static LazyLoadedSynchronized lazyLoadedSynchronized;

    private LazyLoadedSynchronized() {}

    synchronized public static LazyLoadedSynchronized getInstance() {
        if (Objects.isNull(lazyLoadedSynchronized)) {
            lazyLoadedSynchronized = new LazyLoadedSynchronized();
        }
        return lazyLoadedSynchronized;
    }
}
