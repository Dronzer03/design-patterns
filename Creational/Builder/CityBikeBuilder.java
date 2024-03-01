// Concrete Builder class
public class CityBikeBuilder extends BikeBuilder{
    @Override
    public BikeBuilder setAbsChannels() {
        this.absChannels = 0;
        return this;
    }

    @Override
    public BikeBuilder setExhaust() {
        this.exhaust = "Stock Exhaust";
        return this;
    }
}
