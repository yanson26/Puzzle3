import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Puzzle3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Puzzle3.txt"));
        int result = 0;

        Map<Character, Integer> priorities = new HashMap<>();
        int z = 27;
        for (int i = 65; i < 91 ; i++) {
            char q =(char)i;
            priorities.put(q,z);
            z++;
        }
        z = 1;
        for (int i = 97; i < 123 ; i++) {
            char q =(char)i;
            priorities.put(q,z);
            z++;
        }
        //first Part
        /*while(sc.hasNext()){
            String s = sc.nextLine();
            int length = s.length();
            char[] X = s.toCharArray();
            char[] first = new char[length/2];
            char[] second = new char[length/2];
            for (int i = 0; i < length/2; i++) {
                first[i] = X[i];
                second[i] = X[i+length/2];
            }

            char doubled = ' ';
            for (int i = 0; i < length/2; i++) {
                char p = first[i];
                for (int j = 0; j < length / 2; j++) {
                    char q = second[j];
                    if(Objects.equals(p, q)){
                        doubled = q;
                    }
                }
            }

            result += priorities.get(doubled);*/

        //Second Part
        for (int i = 0; i < 100; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            
            char[] S1 = s1.toCharArray();
            char[] S2 = s2.toCharArray();
            char[] S3 = s3.toCharArray();

            for (char letter : S1) {
                for(char letter2 : S2){
                    if(Objects.equals(letter, letter2)){
                        for(char letter3 : S3){
                            if(Objects.equals(letter, letter3)){
                                result += priorities.get(letter);
                                break;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
