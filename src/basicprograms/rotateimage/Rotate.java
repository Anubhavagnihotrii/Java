package basicprograms.rotateimage;


public class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length-1,x=0; j >=0  ; j--,x++) {
                newMatrix[i][x]=matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                matrix[i][j]=newMatrix[i][j];
            }
        }

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
