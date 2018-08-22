/**
 * 测试break和continue语句
 * break用于强行退出循环，不执行循环中剩余的语句。
 * continue 语句用在循环语句体中，用于终止某次循环过程，即跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的判定。
 * @author Musuc
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total = 0;//定义计数器
        System.out.println("Begin");
        
        while (true) {
            total++;//每循环一次计数器加1
            int i = (int) Math.round(100 * Math.random());
            	if (i == 88) { //当i等于88时，退出循环
            	   break;
            }
        }
        //输出循环的次数
        System.out.println("Game over， used " + total + " times");
    }
}