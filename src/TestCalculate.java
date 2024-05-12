import java.util.Arrays;

public class TestCalculate{
    public static void test(){

        int[][] FirstMatrix = {{1,1,1}, {1,1,1}, {1,1,1}};
        int[][] SecondMatrix = {{1,1,1}, {1,1,1}, {1,1,1}};
        int[][] Result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Result[i][j] = FirstMatrix[i][j] + SecondMatrix[i][j];
            }
        }

        int MatrixSum = Arrays.stream(Result).flatMapToInt(Arrays::stream).sum();

        if(MatrixSum == 18)
        System.out.println("Працює вірно");
    }
}