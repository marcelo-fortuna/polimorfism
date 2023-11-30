
/**
 * Class create to instantiating concret objects of type HomeAppliance.
 * @author Marcelo Fortuna
 * @since Class created in 30/11/2023
 */
public class ApplianceStore {

    public static void main(String[] args) throws InterruptedException {
        Television tv = new Television("LG","57",false);
        tv.on();
        tv.off(5);

        System.out.println();

        Blender blender = new Blender("Philips",40,false);
        blender.on(3);
        blender.off();

        System.out.println();

        Microwave mwave = new Microwave("MICROWAVES", 15, false);
        mwave.on(5);
        mwave.off();

        System.out.println();

        AirConditioner air = new AirConditioner("Philco", "CADA3123", false);
        air.on((byte) 1);
        air.off();
    }
}
