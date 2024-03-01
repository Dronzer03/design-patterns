// Builder class
public abstract class BikeBuilder {
    String brandName;
    String modelName;
    String bikeType;
    int engineCapacity;
    int absChannels;
    String exhaust;

    public BikeBuilder setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public BikeBuilder setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public BikeBuilder setBikeType(String bikeType) {
        this.bikeType = bikeType;
        return this;
    }

    public BikeBuilder setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    abstract public BikeBuilder setAbsChannels();

    abstract public BikeBuilder setExhaust();

    public Bike build() {
        return new Bike(this);
    }
}
