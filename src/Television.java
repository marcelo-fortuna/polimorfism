/**
 * Class created to implements the methods of interface IHomeAppliance.
 * @author Marcelo Fortuna
 * @since Class created in 30/11/2023
 */
public class Television implements IHomeAppliance {
    String brand;
    String inch;
    boolean isOn;

    public Television(String brand, String inch, boolean isOn) {
        this.brand = brand;
        this.inch = inch;
        this.isOn = isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
        System.out.println("A televisão foi ligada!");
    }

    @Override
    public void off() {
        this.isOn = false;
        System.out.println("A televisão foi desligada!");
    }

    public void off(int timer) throws InterruptedException {
        System.out.println("Soneca de " + timer + " segundos ativada.");

        while(timer > 0) {
            Thread.sleep(1000);
            System.out.println("Desligando em " + timer + " segundos...");
            timer--;
        }
        off();
    }
}
