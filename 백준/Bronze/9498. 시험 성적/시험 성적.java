import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        if (num >= 90 && num <= 100) {
            answer = "A";
        } else if (num >= 80 && num < 90) {
            answer = "B";
        } else if (num >= 70 && num < 80) {
            answer = "C";
        } else if (num >= 60 && num < 70) {
            answer = "D";
        } else {
            answer = "F";
        }
        
        System.out.println(answer);
    }
}
