import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = 0;

        if (A != B && B != C && A != C) {
            int max = Math.max(A, Math.max(B, C));
            answer = max * 100;
        } 
        else if (A == B && A == C) {
            answer = 10000 + (A * 1000);
        } 
        else if (A == B || A == C) {
            answer = 1000 + (A * 100);
        } 
        else {
            answer = 1000 + (B * 100);
        }
        System.out.println(answer);

    }
}
