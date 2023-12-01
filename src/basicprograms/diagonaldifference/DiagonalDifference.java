package basicprograms.diagonaldifference;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6,},{9,8,9}};

        int sum1=0;
        int sum2 =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(i==j){
                    sum1+=arr[i][j];
                }}
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(i+j== arr.length-1){
                    sum2+=arr[i][j];
                }}
        }
        System.out.println(Math.abs(sum1-sum2));

    }
}

