/**
 * 测试字符类型
 * @author Musuc
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		char a = 'T';
		char b = '我';
		char c = '\u0061';
		System.out.println("" + 'a' + '\n' + 'b');
		System.out.println("" + 'a' + '\t' + 'b');
		System.out.println("" + 'a' + '\'' + 'b');
		
		
		//String就是字符序列
		String d = "abc";
		
		
		
		//测试布尔类型
		boolean man = true;
		
		if (man) {
			System.out.println("你好");
		}
	}

}
