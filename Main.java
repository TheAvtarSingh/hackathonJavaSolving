import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to go for Adder (Attendence Calculator) and 2 for Percentager Calculator : ");
		int t = sc.nextInt();
		if(t==1){
			System.out.println("Enter Number of Students : ");
			int cases = sc.nextInt();
			for (int j = 0; j < cases; j++) {
				int sum = 0;
				for (int i = 0; i < 4; i++) {
					System.out.println("Enter Attendence of student "+(i+1));
					int num = sc.nextInt();
					if (num > 0) {
						sum = sum + num;
						System.out.println("Adding : "+sum);
					}

				}
				System.out.println("Total attendence is :"+sum);
				System.out.println("----------");

			}
		}else if(t==2){
		System.out.println("Enter total Number of Subjects : ");
	Double n = sc.nextDouble();
	System.out.println("Enter total Numbers : ");
	Double total = sc.nextDouble();
	Double sum =0.0;
			for(int i=1;i<=n;i++){
				System.out.println("Enter Marks "+i+" : ");
				Double marksi = sc.nextDouble();
				if(marksi>100){
					System.out.println("Invalid Input");
				}else{
					sum = sum + marksi;
				}
				
			}
			System.out.println("Your Total Sum is : "+sum);
			Double percentage = (sum/total)*100;
			System.out.println("Percentage calculated is : "+percentage);
		}
		
		

	sc.close();	
	}
}
