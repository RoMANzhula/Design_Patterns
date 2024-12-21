package behavioral_patterns.command_pattern;

public class LightTurnOffCommand implements Command {

    private Light light;

    public LightTurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
