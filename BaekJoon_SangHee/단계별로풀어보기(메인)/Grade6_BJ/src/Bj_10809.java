import java.util.*;
public class Bj_10809{
       public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             String word = scan.next();
             int[] wordlist = new int[26];
             for(int t = 0; t < 26; t++) {
                    wordlist[t] = -1;
             }
             
             for(int i = 0; i<word.length(); i++) {
                    int k = (int)word.charAt(i) - 97;
                    if(wordlist[k] == -1) {
                           wordlist[k] = i;
                    }
             }
             
             for(int i = 0; i<26; i++) {
                    System.out.print(wordlist[i] + " ");
             }
       }
}