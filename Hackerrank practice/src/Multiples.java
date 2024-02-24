import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Multiples {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            int i = Integer.parseInt(bufferedReader.readLine().trim());
            int R= N*i;
            if(N>=2&&N<=20){
                for(i=0;i<=10;i++){
                    System.out.printf("%d * %d = %d\n",N,i,R);
                }
            }
            else{
                System.out.println("Enter the number between 1 and 10");
            }

            bufferedReader.close();
        }
    }

