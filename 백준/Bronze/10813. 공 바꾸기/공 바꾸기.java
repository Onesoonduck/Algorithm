import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int before = 0;
        int after = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++) {
                if (arr[j] == arr[I - 1]) {
                    before = arr[j];
                } else if (arr[j] == arr[J - 1]) {
                    after = arr[J - 1];
                    arr[J - 1] = before;
                    arr[I - 1] = after;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
