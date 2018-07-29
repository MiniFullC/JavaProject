/**
 * 测试类型转化
 * 
 * @author Musuc
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		int a = 324;
		long b = a;
		double d = b;
//		a = b;
//		long e = 3.22F;
		float f = 234324L;
		
		
		//特例
		byte b2 = 123;
		
		
		/**
		 * （强制类型转换）
		 */
		
		double x = 3.14;
		int nx = (int)x;
		char c = 'a';
		int p = c+1;
		System.out.println(nx);
		System.out.println(p);
		System.out.println((char)p);
		
	}

}
