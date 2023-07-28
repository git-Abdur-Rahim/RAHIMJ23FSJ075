package second_Lab_book_Java_programs;
import java.util.Scanner;
public class While_Loop_Demo {

	public static void main(String[] args) {
		
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("n Please Enter any integer Value below 10: ");
		number = sc.nextInt();
		while (number <= 10) {
		sum = sum + number;
		number++;
		}
		System.out.format(" Sum of the Numbers From the While Loop is: %d ",
		sum);	
		}

}
