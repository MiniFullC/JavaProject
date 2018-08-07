/**
 * 测试if-else if-else 多选择结构
 * 
 * @author Musuc
 *
 */
public class TestIfElseIfElse {
	public static void main(String[] args) {
		int age = (int)(100*Math.random());
		System.out.println("年龄是"+age+"，属于");
		if (age<15) {
			System.out.println("儿童，要开心！");
		} else if (age<25) {
			System.out.println("青年，记得多学一点！");
		} else if (age<45) {
			System.out.println("中年，努力工作！");
		} else if (age<65) {
			System.out.println("中老年，老当益壮！");
		} else if (age<85) {
			System.out.println("老年，多运动！");
		} else {
			System.out.println("老寿星，古来稀！");
		}
	}

}
