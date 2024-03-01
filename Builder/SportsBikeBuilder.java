// Concrete Builder class
public class SportsBikeBuilder extends BikeBuilder {
    @Override
    public BikeBuilder setAbsChannels() {
        this.absChannels = 3;
        return this;
    }

    @Override
    public BikeBuilder setExhaust() {
        this.exhaust = "SC Project Exhaust";
        return this;
    }
}
