package co.rays.string_interview;

public class ArrayDuplicateFind {
	

		public static void main(String[] args) {
			int arr[]= {1,1,2,2,3,3};
	
			for (int i = 0; i < arr.length; i++) {
				boolean repeated = false;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						repeated = true;
					//	System.out.println(arr[i]);
						break;
					}

				}
				if (!repeated) {
					System.out.println(arr[i]);		
				}
			}
			

		}

	}

