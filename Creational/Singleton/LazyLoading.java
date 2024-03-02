import java.util.Objects;

public class LazyLoading {
    private static LazyLoading lazyLoading;

    private LazyLoading() {}

    public LazyLoading getInstance() {
        if (Objects.isNull(lazyLoading)) {
            lazyLoading = new LazyLoading();
        }
        return lazyLoading;
    }
}
