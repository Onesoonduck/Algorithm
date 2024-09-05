import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = br.readLine();  // 입력받고
        
        StringTokenizer st = new StringTokenizer(str, " "); // 공백을 기준으로 잘라
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else if (a < b) {
            System.out.println("<");
        }

        br.close();

    }
}