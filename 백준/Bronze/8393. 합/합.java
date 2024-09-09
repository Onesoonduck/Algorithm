import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= A; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
