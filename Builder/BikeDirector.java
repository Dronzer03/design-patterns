// This is Director Class
// Works like an Orchestrator
public class BikeDirector {
    public void buildSportsBike(BikeBuilder bikeBuilder) {
        bikeBuilder.setBrandName("Ducati")
                .setModelName("V4S")
                .setBikeType("Sports")
                .setEngineCapacity(999)
                .setExhaust()
                .setAbsChannels();
    }

    public void buildCityBike(BikeBuilder bikeBuilder) {
        bikeBuilder.setBrandName("KTM")
                .setModelName("Duke")
                .setBikeType("City")
                .setEngineCapacity(200)
                .setExhaust()
                .setAbsChannels();
    }
}
