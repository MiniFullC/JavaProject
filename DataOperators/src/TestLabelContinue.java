/**
 * 带标签的Break和Continue
 * 
 * @author Musuc
 *
 */
public class TestLabelContinue {
	public static void main(String[] args) {
		//打印101-150之间所有的质数
		outer:for (int i = 101;i<150;i++) {
			for (int j = 2;j<i/2;j++) {
				if (i % j == 0) {
					continue outer;
				}
			}
			System.out.print(i + " ");
		}
	}

}
