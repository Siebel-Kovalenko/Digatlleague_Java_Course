public class Task {
    public static void main(String[] args) {
       int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(sum(matrix));
    }

    public static int sum(int[][] matrix) {
    int summa = 0;
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (y==x) {
                    summa = summa + matrix[y][x];
                }
            }
        }
        return summa;
    }
}