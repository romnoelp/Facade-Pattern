//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HomeApp {
    public static void main(String[] args) {
        TV tv = new TV();
        AirConditioning airConditioning = new AirConditioning();
        Light light = new Light();
        HomeInterface homeInterface = new HomeInterface(tv, airConditioning, light);

        homeInterface.turnOnAll();
        System.out.println("-----------------------------");
        homeInterface.turnOffAll();
    }
}