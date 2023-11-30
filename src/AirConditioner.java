
/**
 * Class created to implements all methods of interface IHomeAppliance.
 * @author Marcelo Fortuna
 * @since Class created in 30/11/2023
 */
public class AirConditioner implements IHomeAppliance {
    String brand;
    String modelInfo;
    boolean isOn;

    public AirConditioner(String brand, String modelInfo, boolean isOn) {
        this.brand = brand;
        this.modelInfo = modelInfo;
        this.isOn = isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
        System.out.println("Ar condicionado ligado!");
    }

    public void on(byte temperature) {
        on();
        System.out.println("Ar condicionado ligado na temperatura " + ((temperature == 0) ? "Frio" : "Quente"));
    }

    @Override
    public void off() {
        this.isOn = false;
        System.out.println("Ar condicionado desligado!");
    }
}
