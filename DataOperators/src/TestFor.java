/**
 * 测试for循环
 * 
 * @author Musuc
 *
 */

public class TestFor {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1;i<=100;i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
		
	 for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
		 System.out.println("i= " + i + " j= " + j); 
	 }
	 
	   for(;;){
		   System.out.println("ALNa到目前为止我一直爱你！");
	   }
	   }

}
