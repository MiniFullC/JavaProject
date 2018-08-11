/**
 * 打印9*9乘法表
 * @author Musuc
 *
 */

public class MultiplicationTable {
	public static void main(String args[]) {
		for (int i = 1; i < 10; i++) { // i是一个乘数
			for (int j = 1; j <= i; j++) { // j是另一个乘数
				System.out.print(j + "*" + i + "=" + (i * j < 10 ? (" " + i * j) : i * j) + "  ");
			}
			System.out.println();
		}
	}

}
