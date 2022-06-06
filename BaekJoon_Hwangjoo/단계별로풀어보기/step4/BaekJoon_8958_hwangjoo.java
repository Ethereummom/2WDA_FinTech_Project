package step4;
import java.util.Scanner;

public class BaekJoon_8958_hwangjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String arr[] = new String[T];


        for(int i=0; i<T; i++) {
            int count = 0;
            int total = 0;
            arr[i] = sc.next();
            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    total += ++count;
                } else if(arr[i].charAt(j) =='X'){
                    count = 0;
                }
            }
            System.out.println("ÃÑ Á¡¼ö : " + total);
        }

	}

}
