// Facade Class
public class HomeInterface {
    private final TV tv;
    private final AirConditioning airConditioning;

    public HomeInterface(TV tv, AirConditioning airConditioning) {
        this.tv = tv;
        this.airConditioning = airConditioning;
    }

    public void turnOnAll() {
        System.out.println("Turning these appliances on:");
        System.out.println("\t" + tv.getClass());
        System.out.println("\t" +airConditioning.getClass());
    }

    public void turnOffAll() {
        System.out.println("Turning these appliances off:");
        System.out.println("\t" + tv.getClass());
        System.out.println("\t" +airConditioning.getClass());
    }
}
