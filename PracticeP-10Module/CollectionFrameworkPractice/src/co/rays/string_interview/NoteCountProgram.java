package co.rays.string_interview;

public class NoteCountProgram {

	public static void main(String[] args) {
		int count = 0;
		int note[] = { 500, 2000, 100, 50, 20, 10, 5, 2, 1, 200 };
		int money = 5678;
		for (int i = 0; i < note.length; i++) {

			count = money / note[i];
			if (count > 0) {
				System.out.println(note[i] + "=" + count);
			}
			money = money % note[i];

		}

	}

}
