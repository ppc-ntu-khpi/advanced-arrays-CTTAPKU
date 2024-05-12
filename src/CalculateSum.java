import java.util.Arrays;
import java.util.Random;

 /**
     * Метод для обрахунку суми
     * @param n кількість рядків
     * @param m кількість стовпців
     * @param num максимальне число для заповнення матриці
     * 
     */
public class CalculateSum {

    public static void SumCalc(int n, int m, int num) {
        int[][] FirstMatrix = new int[n][m];
        int[][] SecondMatrix = new int[n][m];
        int[][] Result = new int[n][m];

        fillMatrix(FirstMatrix, num);
        fillMatrix(SecondMatrix, num);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Result[i][j] = FirstMatrix[i][j] + SecondMatrix[i][j];
            }
        }
        

        System.out.println("Перша матриця:");
        PrintMatrix(FirstMatrix);

        System.out.println("Друга матриця:");
        PrintMatrix(SecondMatrix);

        System.out.println("Результат матриця:");
        PrintMatrix(Result);
    }

    /**
     * Метод для заповнення матриці випадковими числами в діапазоні від 0 до num
     * @param matrix матриця
     * @param num максимальне число діапазону 
     */
    private static void fillMatrix(int[][] matrix, int num) {
        Random random = new Random();
        for (int[] row : matrix)
            Arrays.setAll(row, rand -> random.nextInt(num) + 1);
    }
    
    /**
     * Метод для виводу матриці
     * @param matrix матриця
     */
    private static void PrintMatrix(int[][] Matrix) {
        for (int[] raw : Matrix)
            System.out.println(Arrays.toString(raw));
    }
}