public class Multidimentionalarray {
    public static void main(String[] args) {
        /*int[][] array = {{1, 2, 3, 4}, {12, 13, 14, 15}, {22, 33, 44, 55}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }*/
        int[][] data={{10,20,30,40},{50,60,70,80}};
        System.out.println(data);
        for(int i=0;i<data.length;i++){
            System.out.println("       Incremented Value -> "+ i);
            for(int j=0;j<data[i].length;j++){
                System.out.println("Incremented VAlue -> " +i+" "+j);
                System.out.println(data[i][j]);

            }
        }
    }
}