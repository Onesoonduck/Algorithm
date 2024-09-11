import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String M = br.readLine();

        int answer = 0;
        for (int i = 0; i < M.length(); i++) {
            int num = Integer.parseInt(String.valueOf(M.charAt(i)));
            answer += num;
        }
        System.out.println(answer);
    }
}
