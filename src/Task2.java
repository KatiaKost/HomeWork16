public class Task2 {
    public static final double PI = 3.14;

    public double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public void displayInfo(double radius) {
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь круга: " + calculateArea(radius));
        System.out.println("Длина окружности: " + calculateCircumference(radius));
    }
}
class Task2Test{
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        double r1 = 5.0;
        double r2 = 4.5;

        double a = t2.calculateArea(r1);
        System.out.println("Площадь круга: " + a);

        double c = t2.calculateCircumference(r1);
        System.out.println("Длина окружности: " + c);

        System.out.println();

        t2.displayInfo(r2);
    }

}
