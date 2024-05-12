import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Кількість рядків: ");
        int n = scanner.nextInt();
        System.out.print("Кількість стовпців: ");
        int m = scanner.nextInt();
        System.out.print("Максимальне число для заповнення матриці: ");
        int num = scanner.nextInt();
        scanner.close();

        CalculateSum.SumCalc(n, m, num);

        TestCalculate.test();
    }
}
