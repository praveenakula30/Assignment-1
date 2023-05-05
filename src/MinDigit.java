import java.util.Scanner;
public class MinDigit{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=0;
		while(n!=0)
		{
			int r=n%10;
			if(r<min)
				min=r;
			n=n/10;
		}
		System.out.println(min);
	}
}
