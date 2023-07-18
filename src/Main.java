import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        int c=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int sum = 0;
        int d = 0;
        for(int i=0; i<size; i++) {
            d=size-i-1;
            sum += matrix[i][d];
        }

        System.out.println(sum);
// 3 - 02,11,20

    }
}