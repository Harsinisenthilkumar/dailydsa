import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean prime = true;
		int n1 = sc.nextInt();
		if(n1<=1) {
			prime=false;
		}
		else {
			for(int i=2; i<n1; i++) {
				if(n1%i==0) {
					prime=false;
					break;
				}}}

		if(prime) {
			System.out.print("It is a prime");
		}
		else {
			System.out.print("It is not a prime");
		}
	}}
