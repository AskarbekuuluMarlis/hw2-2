public class Redmi extends Phone {
    private String miuiVersion;
    private String deviceSerialNumber;

    public Redmi(int display, int camera,  String miuiVersion, String deviceSerialNumber) {
        super(display, camera, "Redmi 9");
        this.miuiVersion = miuiVersion;
        this.deviceSerialNumber = deviceSerialNumber;
    }

    @Override
    public void print() {
        System.out.println("Redmi display: " + getDisplay());
        System.out.println("Redmi camera: " + getCamera());
        System.out.println("Redmi processor: " + getModel());
        System.out.println("Redmi miuiVersion: " + miuiVersion);
        System.out.println("Redmi deviceSerialNumber: " + deviceSerialNumber);
    }
}
