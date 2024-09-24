public class AirConditioning implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("AC opening.");
    }

    @Override
    public void turnOff() {
        System.out.println("AC closing.");
    }
}
