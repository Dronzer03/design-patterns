// This is our Product
public class Bike {
    String brandName;
    String modelName;
    String bikeType;
    int engineCapacity;
    int absChannels;
    String exhaust;

    public Bike(BikeBuilder bikeBuilder) {
        this.brandName = bikeBuilder.brandName;
        this.modelName = bikeBuilder.modelName;
        this.bikeType = bikeBuilder.bikeType;
        this.engineCapacity = bikeBuilder.engineCapacity;
        this.absChannels = bikeBuilder.absChannels;
        this.exhaust = bikeBuilder.exhaust;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", bikeType='" + bikeType + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", absChannels=" + absChannels +
                ", exhaust='" + exhaust + '\'' +
                '}';
    }
}
