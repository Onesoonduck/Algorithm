import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        String[] answer = new String[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int sum = A + B + C + D;

            if (sum == 3) {
                answer[i] = "A";
            } else if (sum == 2) {
                answer[i] = "B";
            } else if (sum == 1) {
                answer[i] = "C";
            } else if (sum == 0) {
                answer[i] = "D";
            } else if (sum == 4) {
                answer[i] = "E";
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(answer[i]);
        }
    }
}
