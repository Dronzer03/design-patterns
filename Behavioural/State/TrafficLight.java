public class TrafficLight {
    State state;

    TrafficLight() {
        System.out.println("All cars out on their positions from qualifying!");
        this.state = new RedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        state.goToNextState();
    }
}
