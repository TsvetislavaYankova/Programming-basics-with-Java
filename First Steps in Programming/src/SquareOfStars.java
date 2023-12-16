import java.util.Scanner;

public class SquareOfStars {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = Integer.parseInt(console.nextLine());
		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				int times = n;
				while (times > 0) {
					System.out.print("*");
					times--;
				}
			} else {
				System.out.print("*");
				int times = n - 2;
				while (times > 0) {
					System.out.print(" ");
					times--;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
