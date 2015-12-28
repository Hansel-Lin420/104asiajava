package 第一學期;

public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 8, 4, 3, 5, 1, 9 };
		System.out.println("Before sort");
		for (int x : data) {
			System.out.print(x + "\t");
		}
		System.out.println();
		InsertSort(data);
		System.out.println("after sort");
		for (int x : data) {
			System.out.print(x + "\t");
		}
		System.out.println();
	}

	private static void InsertSort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			if (arr[i - 1] > arr[i]) {
				int k = i, tmp = arr[i];
				while (k > 0 && arr[k - 1] > tmp) {
					arr[k] = arr[k - 1];
					k--;
				}
				arr[k] = tmp;
			}
		}
	}
}