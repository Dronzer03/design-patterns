import java.util.Objects;

public class LazyLoadingVolatile {
    private static volatile LazyLoadingVolatile lazyLoadingVolatile;

    private LazyLoadingVolatile() {}

    public static LazyLoadingVolatile getInstance() {
        if (Objects.isNull(lazyLoadingVolatile)) {
            synchronized (LazyLoadingVolatile.class) {
                if (Objects.isNull(lazyLoadingVolatile)) {
                    lazyLoadingVolatile = new LazyLoadingVolatile();
                }
            }
        }
        return lazyLoadingVolatile;
    }
}
