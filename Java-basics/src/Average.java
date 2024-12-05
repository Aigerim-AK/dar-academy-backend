// 4.
public class Average {
    int number1;
    int number2;
    int number3;

    public void averageNumber(int number1, int number2, int number3) {
        double averageNumber = (double) (number1 + number2 + number3) / 3;
        System.out.printf("Среднее значение чисел %d, %d и %d = %.3f %n", number1, number2, number3, averageNumber);
    }
}
