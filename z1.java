public class z1 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{5, 5, 5, 5}, {3, 3, 3, 3}, {1, 1, 1, 1}, {4, 4, 4, 4}, {2, 2, 2, 2}};
        for(int i = 0; i < mat.length; ++i){
            for(int j = 0; j < mat[0].length; ++j)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        int i, j; // Сортируем массив
        int[] sum = new int[mat.length];
        for (i = 0; i < mat.length; ++i) {
            sum[i] = 0;
            for (j = 0; j < mat[0].length; ++j)
                sum[i] += mat[i][j];
        }
        int k;
        for (i = 0; i < mat.length; ++i) {
            k = i;
            for (j = i + 1; j < mat.length; ++j) {
                if (sum[j] < sum[k])
                    k = j;
            }
            if(k != i){
                int tmp = sum[k];
                sum[k] = sum[i];
                sum[i] = tmp;
                for(j = 0; j < mat[0].length; ++j) {
                    int tmp2 = mat[k][j];
                    mat[k][j] = mat[i][j];
                    mat[i][j] = tmp2;
                }
            }
        }
        for(i = 0; i < mat.length; ++i){
            for(j = 0; j < mat[0].length; ++j)
                System.out.print(mat[i][j] + " ");
            System.out.println(); // Вывод результата
        }
    }
}
