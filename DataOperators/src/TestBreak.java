public class TestBreak {
	public static void main(String[] args) {
		int total = 0;//定义计数器
        System.out.println("Begin");
        
        while (true) {
            total++;//每循环一次计数器加1
            int i = (int) Math.round(100 * Math.random())；
            	if (i == 88) { //当i等于88时，退出循环
            	   break;
            }
        }
        //输出循环的次数
        System.out.println("Game over， used " + total + " times.");
    }
}