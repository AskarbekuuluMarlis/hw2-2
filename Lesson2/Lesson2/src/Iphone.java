public class Iphone extends Phone {
    private String iOSVersion;
    private int batteryLevel;

    public Iphone(int display, int camera,  String iOSVersion, int batteryLevel) {
        super(display, camera, "Iphone ");
        this.iOSVersion = iOSVersion;
        this.batteryLevel = batteryLevel;
    }


    @Override
    public void print() {
        System.out.println("Iphone display: " + getDisplay());
        System.out.println("Iphone camera: " + getCamera());
        System.out.println("Iphone processor: " + getModel());
        System.out.println("Iphone iOS version: " + iOSVersion);
        System.out.println("Iphone battery level: " + batteryLevel);
    }
}
