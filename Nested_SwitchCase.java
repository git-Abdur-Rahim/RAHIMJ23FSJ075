package second_Lab_book_Java_programs;

public class Nested_SwitchCase {

	public static void main(String[] args) {
		int tech = 1;
		int course = 2;
		switch(tech){
		case 1:
		System.out.println("python");
		break;
		case 2:
		switch(course){
		case 1:
		System.out.println("J2EE");
		break;
		case 2:
		System.out.println("advance java");
		}
	
		}
	
	}
	

}
