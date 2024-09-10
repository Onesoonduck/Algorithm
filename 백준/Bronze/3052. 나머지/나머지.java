import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i] = (Integer.parseInt(st.nextToken()) % 42);
        }
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(arr.length);

    }
}
