package second_Lab_book_Java_programs;
import java.util.Scanner;
public class To_Input_Elements_In_Array_From_User {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements:");
		for (int i=0; i<10; i++)
		{
		array[i] = scanner.nextInt();
		}
		for( int num : array) {
		sum = sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);
		
	}

}
