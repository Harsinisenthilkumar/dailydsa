import java.util.*;
import java.lang.Math;
public class Calender
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ord = 0;
		int lpy = 0;
		int nlpy = 0;
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		    switch (Math.floorDiv(((year - 1) % 400), 100)){
		        case 1:
		            ord=ord+5;
		            break;
		        case 2:
		            ord=ord+3;
		            break;
		        case 3:
		            ord=ord+1;
		            break;
		        default:
		            break;
		    }
		    for(int i=1;i<=((year-1)%100);i++){
		        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
		            lpy=lpy+1;
		        }
		        else{
		            nlpy=nlpy+1;
		        }
		    }
		    ord=ord+(lpy*2)+(nlpy);
		    switch(month-1){
		        case 1:
		            ord=ord+3;
		            break;
		        case 2:
		            ord=ord+3;
		            break;
		        case 3:
		            ord=ord+6;
		            break;
		        case 4:
		            ord=ord+1;
		            break;
		        case 5:
		            ord=ord+4;
		            break;
		        case 6:
		            ord=ord+6;
		            break;
		        case 7:
		            ord=ord+2;
		            break;
		        case 8:
		            ord=ord+5;
		            break;
		        case 9:
		            ord=ord+0;
		            break;
		        case 10:
		            ord=ord+3;
		            break;
		        case 11:
		            ord=ord+5;
		            break;
		        default:
		            break;
	}
	if(((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month > 2){
	    ord=ord+1;
	}
	switch((ord+date)%7){
	    case 0:
	        System.out.println("Sunday");
	        break;
	    case 1:
	        System.out.println("Monday");
	        break;
	    case 2:
	        System.out.println("Tuesday");
	        break;
	    case 3:
	        System.out.println("Wednesday");
	        break;
	    case 4:
	        System.out.println("Thursday");
	        break;
	    case 5:
	        System.out.println("Friday");
	        break;
	    case 6:
	        System.out.println("Saturday");
	        break;
	}
		// close the Scanner to avoid resource leak
		sc.close();
}
}