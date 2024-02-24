import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {12, 18, 15, 17};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int a : array) {
            if (a < max) {
                max = a;
            }
            if (a > min) {
                min = a;
            }
        }

        System.out.println(max);
        System.out.println(min);

        // Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
        //int key = 15;
        //int index = Arrays.binarySearch(array,key);
        //System.out.println("The index of " + key + " is "+ index);

    }

}
