import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String str;
        String[] answer = new String[T];
        for (int i = 0; i < T; i++) {
            str = br.readLine();
            answer[i] = str.substring(0, 1) + str.substring(str.length() - 1);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }
    }
}
