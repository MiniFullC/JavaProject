/**
 * 逻辑运算符
 * @author Musuc
 *
 */
public class TestOperator02 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 & b2);
		System.out.println(b1 | b2);
		System.out.println(b1 && b2);
		System.out.println(b1 ^ b2);
		System.out.println(!b2);
		
		
		
		//短路
	//	int c = 3/0;    //短路与，第一个操作书的值为false，则不需要计算后面。
	
		
		
/**
 * 位运算
 */
		
		int a = 3;
		int b = 4;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		
		
		//位移
		int c = 3 << 2;
		System.out.println(c);
		System.out.println(12 >> 2);
		
	}
	

}
