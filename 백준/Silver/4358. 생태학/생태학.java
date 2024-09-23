import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hash = new HashMap<>();
        int count = 0;

        while (true) {
            String str = br.readLine();
            if (str == null || str.length() == 0) {
                break;
            }
            count++;
            hash.put(str, hash.getOrDefault(str, 0) + 1);
        }

        Object[] keyArr = hash.keySet().toArray();
        Arrays.sort(keyArr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < keyArr.length; i++) {
            int value = hash.get(keyArr[i]);
            double percent = ((double) value / (double) count) * 100;
            sb.append(keyArr[i] + " " + String.format("%.4f", percent) + "\n");
        }
        System.out.println(sb.toString());

    }
}