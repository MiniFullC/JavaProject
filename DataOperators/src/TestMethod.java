import java.awt.print.Printable;

/**
 * 测试方法的基本使用
 * 
 * @author Musuc
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		// 通过对象调用方法
		TestMethod an = new TestMethod();
		System.out.println("I want to say:");
		an.printSxt();
		int c = an.add(500, 20, 1) + 1000;
		System.out.println(c);

	}

	void printSxt() {
		System.out.println("Aln 晚上好");
	}

	int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum;
	}
}
