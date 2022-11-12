import java.util.Scanner;
import java.util.*;

public class z1 {
    public void z1() {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Integer[][] matrix = new Integer[n][n + 1];
        int sum;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = scan.nextInt();
                sum += matrix[i][j];
            }
            matrix[i][0] = sum;
        }

        List<Integer[]> matrixList = Arrays.asList(matrix);
        Collections.sort(matrixList, new Comparator<Integer[]>() {
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0];
            }
        });

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print ("sum = " + matrix[i][0] + "\t");
            System.out.println();
        }
    }
}
