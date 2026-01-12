package ch13_abstraction.interfaces;

public class AirConditionerController {
    private PowerButton powerButton;
    private ModeChangeButton modeChangeButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    public AirConditionerController(PowerButton powerButton, ModeChangeButton modeChangeButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.modeChangeButton = modeChangeButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    public void onPressedModeChangeButton() {
        modeChangeButton.onPressed();
    }
    public void onPressedDownTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }
    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }
    public void onPressedUPTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }
    public void onUPTemperatureUpButton() {
        System.out.println(temperatureUpButton.onUp());
    }
}

