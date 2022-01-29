import java.util.Scanner;

public class testStudent {

	public static void main(String[] args) {
		int option = -1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student name, age, number of marks.");
		Student s1 = new Student(input.next(), input.nextInt(), input.nextInt());

		do {
			System.out.println("\n(1) Add Mark. ");
			System.out.println("(2) Delete Mark. ");
			System.out.println("(3) Search Mark. ");
			System.out.println("(4) Display Student info. ");
			System.out.println("(5) Students Minimum and Maximum Mark. ");
			System.out.println("(6) Students Number Of 0 Marks. ");
			System.out.println("(7) Students Marks Average. ");
			System.out.println("(8) Sort Students Marks.");
			System.out.println("(9) Exit. \n ");
			System.out.print("    Choose An Option >> ");

			option = input.nextInt();
			if (option > 0 && option < 9) {
				switch (option) {
				case 1:
					System.out.print("Enter The Mark >> ");
					int value = input.nextInt();
					if (s1.addMark(value))
						System.out.println("Mark has been added.");
					else
						System.out.println("Failed to add mark(marks list is full).");
					break;

				case 2:
					System.out.print("Enter The Mark Position >> ");
					int position = input.nextInt() - 1;
					if (s1.deleteMark(position))
						System.out.println("Mark has been deleted.");
					else
						System.out.println("Failed to delete mark(mark not found).");
					break;
				case 3:
					System.out.println("Enter The Mark Value >> ");
					int pos = s1.searchMark(input.nextInt());
					if (pos == -1)
						System.out.println("Mark Position not found.");
					else {
						pos += 1;
						System.out.println("Mark position is: " + pos);
					}
					break;
				case 4:
					s1.display();
					break;
				case 5:
					s1.MinMaxMark();
					break;
				case 6:
					int count = s1.countFrequency();
					if (count == 0)
						System.out.println("There are no zero marks.");
					else
						System.out.println("The number of zero marks is: " + count);
					break;
				case 7:
					System.out.println("The marks average is: " + s1.averageMark());
					break;
				case 8:
					s1.sortMarks();
					System.out.println("Marks are sorted.");

				}
			}

		} while (option != 9);

		System.out.println("GoodBye..");

	}

}
