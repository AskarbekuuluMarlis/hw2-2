public class Sumsung extends Phone {
    private String androidVersion;
    private int ramSizeGB;
    private String screenType;

    public Sumsung(int display, int camera,  String androidVersion, int ramSizeGB, String screenType) {
        super(display, camera, "Sumsang12 ");
        this.androidVersion = androidVersion;
        this.ramSizeGB = ramSizeGB;
        this.screenType = screenType;
    }


    @Override
    public void print() {
        System.out.println("Samsung display: " + getDisplay());
        System.out.println("Samsung camera: " + getCamera());
        System.out.println("Samsung processor: " + getModel());
        System.out.println("Samsung androidVersion: " + androidVersion);
        System.out.println("Samsung ramSizeGB: " + ramSizeGB);
        System.out.println("Samsung screenType: " + screenType);
    }
}
