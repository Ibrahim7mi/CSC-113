
public class Student {
	private String name;
	private int age;
	private int[] marks;
	int nbm;

	public Student(String name, int age, int size) {
		this.name = name;
		this.age = age;
		this.marks = new int[size];
		this.nbm = 0;

	}

	public boolean addMark(int value) {
		if (nbm < marks.length) {
			marks[nbm++] = value;
			return true;
		}
			return false;
		

	}

	public boolean deleteMark(int pos) {
		if (pos >= nbm)
			return false;
		marks[pos] = marks[--nbm];
		return true;
	}

	public int searchMark(int value) {
		for (int i = 0; i < marks.length; i++)
			if (marks[i] == value)
				return i;
		return -1;

	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("The marks are: ");
		for (int i = 0; i < marks.length; i++)
			System.out.print(marks[i] + " ");
	}

	public int maximumMark() {
		int max = marks[0];
		for (int i = 1; i < marks.length; i++)
			if (marks[i] > max)
				max = marks[i];
		return max;
	}

	public int minimumMark() {
		int min = marks[0];
		for (int i = 1; i < marks.length; i++)
			if (marks[i] < min)
				min = marks[i];
		return min;

	}

	public void MinMaxMark() {
		System.out.println("The minmimum mark is: " + minimumMark());
		System.out.println("The maximum mark is: " + maximumMark());

	}

	public int countFrequency() {
		int count = 0;
		for (int i = 0; i < marks.length; i++)
			if (marks[i] == 0)
				count++;
		return count;
	}

	public double averageMark() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
			sum += marks[i];
		return sum / nbm;
	}

	public void sortMarks() {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 1; i < marks.length; i++) {
				int temp;
				if (marks[i] < marks[i - 1]) {
					temp = marks[i - 1];
					marks[i - 1] = marks[i];
					marks[i] = temp;
					sorted = false;
				}

			}

		}

	}


}
