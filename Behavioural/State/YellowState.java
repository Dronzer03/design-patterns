public class YellowState implements State{
    private TrafficLight trafficLight;
    YellowState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    @Override
    public void goToNextState() {
        System.out.println("Red flag! Red flag! Race is stopped!");
        trafficLight.setState(new RedState(trafficLight));
    }
}
