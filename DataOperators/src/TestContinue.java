/**
 * 测试continue  语句用在循环语句体中，用于终止某次循环过程，即跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的判定。
 * @author Musuc
 *
 */
public class TestContinue {
	public static void main(String[] args) {
		
//把100-150之间不能被3整除的数输出，并每行输出5个
		
		int count = 0;//定义计数器
		for (int i = 100; i < 150;i++) { //如果是3的倍数，则跳过本次循环
			if (i% 3 == 0) {
				continue;
			}
			
			//如果是3的倍数，则输出该数
			System.out.print(i + "，");
			count++;//每输出一个数，计数器+1
			
			//根据计数器判断每行是否已经输出了5个数
			if (count %  5 == 0) {
				System.out.println();
				count = 0;
			}
		}
	}

}
