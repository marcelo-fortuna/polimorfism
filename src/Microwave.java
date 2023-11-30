
/**
 * Class created to implements all methods of interface IHomeAppliance.
 * @author Marcelo Fortuna
 * @since Class created in 30/11/2023
 */
public class Microwave implements IHomeAppliance {
    String brand;
    int time;
    boolean isOn;

    public Microwave(String brand, int time, boolean isOn) {
        this.brand = brand;
        this.time = time;
        this.isOn = isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
        System.out.println("Microondas ligado!");
    }

    public void on(int timer) throws InterruptedException {
        on();

        this.time = this.time + timer;
        System.out.println("Timer de " + timer + " segundos adicionado.");

        while(this.time >= 0) {
            Thread.sleep(1000);
            System.out.println("00:" + this.time);
            this.time--;
        }
    }

    @Override
    public void off() {
        this.isOn = false;
        System.out.println("Microondas desligado!");
    }
}
