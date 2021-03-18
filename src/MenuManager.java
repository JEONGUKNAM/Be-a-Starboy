import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6)
		{
		
		System.out.println("1. Add Students");
		System.out.println("2. Your bad habits");
		System.out.println("3. Edit Strength");
		System.out.println("4. View Students");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num = input.nextInt();
		if (num==1)
		{
			System.out.println("Student ID :");
			int studentID = input.nextInt();
			System.out.print("Student Name: ");
			String studentName = input.next();
			System.out.print("Student e-mail address: ");
			String studentemailaddress = input.next();
			System.out.print("Student phone number: ");
			String studentphonenumber = input.next();
		}
		else if (num ==2)
		{
			
			System.out.println("Do you have any disadvantages? (Y/N) :");
			Scanner b = new Scanner(System.in);
			char z = b.next().charAt(0);
			
			if (('Y'==z) || ('y'==z))
			{	
			System.out.println("Write down the three biggest disavantages");
			String studentID = input.nextLine();
			System.out.print("number 1 : ");
			String badhabit1 = input.nextLine();
			System.out.print("number 2 : ");
			String badhabit2 = input.nextLine();
			System.out.print("number 3 : ");
			String badhabit3 = input.nextLine();
			}
			else
			{
				System.out.println("거짓말치지 마시오!!!");
			}
		}
		else if (num ==3)
		{
			System.out.println("Do you do for your strengths? (Y/N) :");
			Scanner c = new Scanner(System.in);
			char a = c.next().charAt(0);
			
			if (('Y'==a) || ('y'==a))
			{
			String studentID = input.nextLine();
			System.out.print("number 1 : ");
			String strength1 = input.nextLine();
			System.out.print("number 2 : ");
			String strength2 = input.nextLine();
			System.out.print("number 3 : ");
			String strength3 = input.nextLine();
			}
			else
			{
				System.out.println("자신을 위해서 노력할 필요가 있습니다!!!");
			}
		}
		else if (num ==4)
		{
			System.out.println("Student ID :");
			int studentID = input.nextInt();
			System.out.print("Student Name: ");
			String studentName = input.next();
		}
		else if (num ==5)
		{
			System.out.println("Student ID :");
			int studentID = input.nextInt();
			System.out.print("Student Name: ");
			String studentName = input.next();
		}
		else if (num ==6)
		{
			System.out.println("Student ID :");
			int studentID = input.nextInt();
			System.out.print("Student Name: ");
			String studentName = input.next();
		}
		else 
		{
			System.out.println("올바른 숫자를 입력하세요!");
		}
			
		}
		}
	}

