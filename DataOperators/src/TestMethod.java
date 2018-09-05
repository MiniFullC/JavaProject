/**
 * 测试方法的基本使用
 * @author Musuc
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法
		TestMethod an= new TestMethod();
		an.printMes();
		System.out.println("And I want to say:");
		an.add(500,20,1);
		
	}
	void printMes() {
		System.out.println("Aln早上好");
		System.out.println("Aln中午好");
		System.out.println("Aln晚上好");
	}
	
	void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}

}
