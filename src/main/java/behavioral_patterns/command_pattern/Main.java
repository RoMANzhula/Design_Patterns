package behavioral_patterns.command_pattern;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightTurnOnCommand(light);
        Command lightOff = new LightTurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }

}

//Output:
//Light is turn on.
//Light is turn off.