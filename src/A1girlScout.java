
import java.util.Scanner;
public class A1girlScout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,d=0,e=0,i=0,size;
		//a means the number of girl scouts who
		//sell from 0 to 10 boxes, b means from 11 to 20,
		//.....e means 41 and more.
		System.out.print("Please enter how many girl scouts ");
		System.out.println("we have.");
		Scanner keyboard = new Scanner(System.in);
		size=keyboard.nextInt();
		int[] girlScout=new int[size];
		for (i=0; i<size;i++){
			System.out.print("Please enter the number of boxes ");
			System.out.println("this girl scout sold.");			
			girlScout[i]=keyboard.nextInt();
			//ask the user to enter the data, and store them
			//in the array
		}
		
		for (i=0;i<size;i++){
			if (girlScout[i]<=10){
				a=a+1;
			}
			else if (girlScout[i]<=20){
				b=b+1;
			}
			else if (girlScout[i]<=30){
				c=c+1;
			}
			else if (girlScout[i]<=40){
				d=d+1;
			}
			else {
				e=e+1;
			}				
		}
		
		System.out.printf("%-20s %-30s\n","TOTAL BOXES", "Number of girl scouts");
		System.out.printf("%-20s %-30d\n","from 0 to 10", a);
		System.out.printf("%-20s %-30d\n","from 11 to 20", b);
		System.out.printf("%-20s %-30d\n","from 21 to 30", c);
		System.out.printf("%-20s %-30d\n","from 31 to 40", d);
		System.out.printf("%-20s %-30d\n","41 or more", e);				
	}

}
