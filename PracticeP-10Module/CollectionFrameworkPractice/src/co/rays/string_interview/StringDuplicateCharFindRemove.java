package co.rays.string_interview;

public class StringDuplicateCharFindRemove {

	public static void main(String[] args) {
		String str = "programming";
		char arr[] = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					System.out.println(arr[i]);
					break;
				}

			}
			if (!repeated) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);

	}

}
