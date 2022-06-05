import java.util.Scanner;

public class Bj_2439 {
    public static void main(String[] args) {
        //입력 받는 변수 선언
        int n;

        //입력 받기
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //i = 행, j = 열
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                //스페이스
                if(j <= n-i)
                {
                    System.out.print(" ");
                }
                //별
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}