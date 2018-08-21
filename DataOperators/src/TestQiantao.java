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
		
		
		
		
		//用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
		int h = 0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
				System.out.print(i+"\t");
				h++;
			}
			if(h ==5) {
				System.out.println();
				h=0;
			}
			
//			if(i%25 ==0) {
//				System.out.println();
//			}
		}
	}
}
