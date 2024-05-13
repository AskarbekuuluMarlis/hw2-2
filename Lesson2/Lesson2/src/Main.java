public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Круг", 10);
        Square square = new Square("Квадрат", 34);
        Triangle triangle = new Triangle("Треугольник", 12, 4, 5);

        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Багира");

        Drawable[] drawables = {circle, square, triangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + " Периметр -> " +
                        ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName());
            }

            drawables[i].draw();
        }


        Phone[] printables = {
                createObject("Iphone"),
                createObject("Redmi 9"),
                createObject("Samsung12")};

        for (Phone printable : printables) {
            printable.print();
        }
    }

    public static Phone createObject(String className) {
        Phone phone = null;
        switch (className) {
            case "Iphone":
                phone = new Iphone(6, 20, "Ios 19", 99);
                break;
            case "Redmi 9":
                phone = new Redmi(6, 20, "Snapdragon","123");
                break;
            case "Samsung12":
                phone = new Sumsung(25, 62, "android 10",155,"Geforse");
                break;

        }
        return phone;
    }


}
