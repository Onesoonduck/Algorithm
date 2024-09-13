import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int answer = 100;

        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num % 2 != 0) {
                sum += num;
                sb.append(num + " ");
                answer = Math.min(num, answer);
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(answer);
        } else {
            System.out.println("-1");
        }
        
    }
}
