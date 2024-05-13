public class Phone implements Printble {
    private int display;
    private int camera;
    private String model;

    public Phone(int display, int camera, String model) {
        this.display = display;
        this.camera = camera;
        this.model = model;
    }

    public int getDisplay() {
        return display;
    }

    public String getModel() {
        return model;
    }


    public int getCamera() {
        return camera;
    }


    @Override
    public void print() {
        System.out.println("Display: " + display);
    }
}
