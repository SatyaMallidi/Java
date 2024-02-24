public class Multidimentionalarray2 {
    public static void main(String[] args){
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int[][] B={{1,2,3},{4,5,6},{7,8,9}};
        int[][] c= new int[3][3];
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 c[i][j]=0;
                 for(int k=0;k<3;k++){
                     c[i][j] += A[i][k]*B[k][j];
                 }
                 System.out.print(c[i][j]+ " ");
             }System.out.println();
         }claa
    }
}
