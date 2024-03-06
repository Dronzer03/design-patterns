public class RedState implements State{
    private TrafficLight trafficLight;
    RedState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    @Override
    public void goToNextState() {
        System.out.println("Lights out and away we go!");
        trafficLight.setState(new GreenState(trafficLight));
    }
}
