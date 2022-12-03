import java.io.File;
import java.io.FileNotFoundException;
import java.nio.CharBuffer;
import java.util.*;

public class Puzzle3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Puzzle3.txt"));
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();
        int z = 27;
        for (int i = 65; i < 91 ; i++) {
            char q =(char)i;
            map.put(q,z);
            z++;
        }
        z = 1;
        for (int i = 97; i < 123 ; i++) {
            char q =(char)i;
            map.put(q,z);
            z++;
        }
        while(sc.hasNext()){
            String s = sc.nextLine();
            int length = s.length();
            char[] X = s.toCharArray();
            char[] first = new char[length/2];
            char[] second = new char[length/2];
            for (int i = 0; i < length/2; i++) {
                first[i] = X[i];
                second[i] = X[i+length/2];
            }
            char x = '2';
            char y = '3';

            char doubled = 0;
            for (int i = 0; i < length/2; i++) {

            }

            result += map.get(doubled);


        }

        System.out.println(result);
    }
}
