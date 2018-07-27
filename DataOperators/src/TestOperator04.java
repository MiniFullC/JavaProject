/**
 * 条件运算符（三元运算符）
 * @author wangcc
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {
		int score = 80;
		int x = -100;

		String type = score < 60 ? "不及格" : "及格";
		System.out.println(type);

		if (score < 60) {
			System.out.println("不及格");
		} else {
			System.out.println("及格");
		}

		System.out.println(x > 0 ? 1 : (x == 0 ? 0 : -1));

	}
}
