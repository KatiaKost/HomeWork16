public class Task1 {
    public static int multiplyThreeNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void divideNumbers(int num1, int num2) {
        int division = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Частное: " + division + ", остаток: " + remainder);
    }
}
class Task1Test{
    public static void main(String[] args) {

        int result = Task1.multiplyThreeNumbers(2, 3, 4);
        System.out.println("Произведение трёх чисел: " + result);

        Task1.divideNumbers(12,5);

    }
}
