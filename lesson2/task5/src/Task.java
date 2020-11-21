public class Task {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,888,9}};
        System.out.println(maxValue(matrix));


    }

    public static int maxValue(int[][] matrix) {
        int max = 0;
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (max < matrix[y][x]) {
                    max = matrix[y][x];
                }
            }
        }
        return max;
    }
}