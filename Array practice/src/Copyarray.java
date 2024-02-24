import java.util.Arrays;
public class Copyarray {
    public static void main(String[] args){
        int[] array = {5,6,7,8,9,0};
        int[] array1 = new int [array.length];
        System.arraycopy(array,0,array1,0,array.length);
        for(int n:array1)
            System.out.printf(n +" ");
        System.out.println(array1[3]);
        System.out.println(Arrays.equals(array,array1));
        }
    }

