public class GreenState implements State{
    private TrafficLight trafficLight;

    GreenState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    @Override
    public void goToNextState() {
        System.out.println("Yellow flag! Safety Car in this Lap!");
        trafficLight.setState(new YellowState(trafficLight));
    }
}
