import java.util.Scanner;

public class creating2D_Array {
    public static void mdArray(){
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int[3][3];
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter a number for: " + i + " row " + j + " column ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        mdArray();
    }
}
