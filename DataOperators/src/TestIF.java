import java.util.regex.Matcher;

/**
 * 测试if 单选泽结构
 * 
 * @author Musuc
 *
 */
public class TestIF {
	public static void main(String[] args) {
		double d = Math.random(); // 返回【0,1）之间的随机数
		System.out.println(d);

		int w = (int) (6 * Math.random() + 1);
		System.out.println(w);
		if (w < 3) {
			System.out.println("小");
		}

		System.out.println("*************");

		// 通过掷三次骰子看看今天的手气如何？
		int i = (int) (6 * Math.random()) + 1;
		int j = (int) (6 * Math.random()) + 1;
		int k = (int) (6 * Math.random()) + 1;
		int count = i + j + k; // 如果三次骰子之和大于15，则运气不错

		if (count > 15) {
			System.out.println("见天的手气很好");

		}

		// 如果三个骰子之和在10-15之间，则运气一般
		if (count >= 10 && count <=15) {
			System.out.println("今天手气一般");

		}

		// 如果三个骰子之和小于10，则手气不怎么样
		if (count < 10) {
			System.out.println("今天手气不怎么样");

		}
		
		System.out.println("得了" + count + "分");
	}
}