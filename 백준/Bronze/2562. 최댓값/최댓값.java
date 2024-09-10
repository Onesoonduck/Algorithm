import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int count = 0;
        int answer = 0;

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                answer = count;
            }
        }
        System.out.println(max);
        System.out.println(answer);
    }
}