/**
 * 测试嵌套循环
 * 
 * @author Musuc
 *
 */
public class TestQiantao {
	public static void main(String[] args) {
	//	int i =1;
		
		for (int i =1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("###################");
		//用while循环分别计算100以内的奇数及偶数的和，并输出
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1;i <= 100;i++) {
			if(i%2 == 0) {
				sum1+=i;
			}else {
				sum2+=i;
			}
		}
		
		System.out.println("奇数和："+sum1);
		System.out.println("偶数和："+sum2);
	}
}
