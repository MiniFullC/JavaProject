/**
 *  测试自增自减
 * @author Musuc
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
		int a = 3;
		int b = a++;   //执行完成后b=3.先给b赋值，再自增
		
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a;  //执行完后 c=5. a先自增，再给c赋值
		System.out.println("a="+a+"\nb="+b);

		
	}

}
