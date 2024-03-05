public class CommandClient {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Device television = new Television();
        Device airConditioner = new AirConditioner();

        TurnOnCommand turnOnTV = new TurnOnCommand(television);

        remoteControl.setCommand(turnOnTV);
        remoteControl.pressButton();

        TurnOffCommand turnOffTV = new TurnOffCommand(television);

        remoteControl.setCommand(turnOffTV);
        remoteControl.pressButton();

        System.out.println();

        TurnOnCommand turnOnAC = new TurnOnCommand(airConditioner);

        remoteControl.setCommand(turnOnAC);
        remoteControl.pressButton();

        TurnOffCommand turnOffAC = new TurnOffCommand(airConditioner);

        remoteControl.setCommand(turnOffAC);
        remoteControl.pressButton();
    }
}
