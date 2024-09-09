import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        String answer = "";

        for (int i = 0; i < A; i++) {
            answer += "*";
            System.out.println(answer);
        }

    }
}
