public class EagerLoading {
    private static EagerLoading eagerLoading = new EagerLoading();

    private EagerLoading() {}

    public EagerLoading getInstance() {
        return eagerLoading;
    }
}
