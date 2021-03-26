import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num !=6)
		{
			System.out.println("*** Be a Starboy ***");
			System.out.println("1. Add Students");
			System.out.println("2. Your bad habits");
			System.out.println("3. Edit Strength");
			System.out.println("4. Things you want to do");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if (num==1) {
				AddStudent();
			}
			else if (num==2) {
				Yourbadhabits();
			}
			else if (num==3) {
				EditStrength();
			}
			else if (num==4) {
				Thingsyouwanttodo();
			}
			else if (num==5) {
				ShowaMenu();
				continue;
			}
			else if (num==6) {
				Exit();
				break;
			}
			else {
				continue;
			}

		}
	}

	public static void AddStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int StudentId = input.nextInt();
		System.out.print("Student Name:");
		String Studentname = input.next();
		System.out.print("E-mail Address:");
		String emailaddress = input.next();
		System.out.println(emailaddress);
		System.out.print("Student Phone number:");
		String Studentphone = input.next();
	}

	public static void Yourbadhabits() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your bad habits:");
		String Badhabits = input.next();
		System.out.print("Your bad habits:");
		String Badhabits2 = input.next();
		System.out.print("Your bad habits:");
		String Badhabits3 = input.next();

	}

	public static void EditStrength() {
		Scanner input = new Scanner(System.in);
		System.out.print("Edit Strength:");
		String Editstrength = input.next();
		System.out.print("Edit Strength:");
		String Editstrength2 = input.next();
		System.out.print("Edit Strength:");
		String Editstrength3 = input.next();
		

	}

	public static void Thingsyouwanttodo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Things you want to do :");
		int Thingsyouwanttodo = input.nextInt();
		System.out.print("Things you want to do:");
		int Thingsyouwanttodo2 = input.nextInt();
		System.out.print("Things you want to do:");
		int Thingsyouwanttodo3 = input.nextInt();

	}

	public static void ShowaMenu() {
		
		

	}

	public static void Exit() {
		System.out.print("Bye");

	}
}
