import java.util.Scanner;

public class Bj_2439 {
    public static void main(String[] args) {
        //�Է� �޴� ���� ����
        int n;

        //�Է� �ޱ�
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //i = ��, j = ��
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                //�����̽�
                if(j <= n-i)
                {
                    System.out.print(" ");
                }
                //��
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