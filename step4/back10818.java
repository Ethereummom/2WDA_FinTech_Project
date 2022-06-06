import java.util.Scanner;
public class back10818 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int s = sc.nextInt();
		int num;
		int min = sc.nextInt();
		int max = min;
		for(int i = 1; i<s; i++){
			num = sc.nextInt();
			if(max < num)
				max = num;
			else if(min > num)
				min = num;
		}
		System.out.print(min+" ");
		System.out.print(max);
    }
}