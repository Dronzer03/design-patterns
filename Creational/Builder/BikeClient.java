// This is our Client with ultimate Products
public class BikeClient {
    public static void main(String[] args) {
        BikeDirector bikeDirector = new BikeDirector();

        CityBikeBuilder cityBikeBuilder = new CityBikeBuilder();
        SportsBikeBuilder sportsBikeBuilder = new SportsBikeBuilder();

        bikeDirector.buildCityBike(cityBikeBuilder);
        bikeDirector.buildSportsBike(sportsBikeBuilder);

        Bike cityBike = cityBikeBuilder.build();
        Bike sportsBike = sportsBikeBuilder.build();

        System.out.println(cityBike.toString());
        System.out.println(sportsBike.toString());
    }
}
