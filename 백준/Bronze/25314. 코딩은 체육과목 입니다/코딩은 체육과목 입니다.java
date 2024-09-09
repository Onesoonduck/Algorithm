import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = A / 4;
        String answer = "";

        // A / 4 로 나눈 몫 만큼 long을 붙이면 됨

        for (int i = 1; i <= B; i++) {
            answer += "long ";
        }

        System.out.println(answer + "int");

    }
}
