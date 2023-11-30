
/**
 * Class created to implements all methods of interface IHomeAppliance.
 * @author Marcelo Fortuna
 * @since Class created in 30/11/2023
 */
public class Blender implements IHomeAppliance {
    String brand;
    int capacity;
    boolean isOn;

    public Blender(String brand, int capacity, boolean isOn) {
        this.brand = brand;
        this.capacity = capacity;
        this.isOn = isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
        System.out.println("O liquidificador foi ligado!");
    }

    public void on(int speed) {
        on();
        System.out.println("O liquidificador foi ligado na velocidade " + speed + ".");
    }

    @Override
    public void off() {
        this.isOn = false;
        System.out.println("O liquidificador foi desligado!");
    }
}
