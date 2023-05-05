import java.util.Scanner;
public class Strong{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			int f=1,i;
			for(i=1;i<=r;i++)
			{
				f=f*i;
			}
			s=s+f;
			n=n/10;
		}
		if(s==num)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");

	}
}
