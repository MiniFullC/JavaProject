/**
 * 打印9*9乘法表v2
 * 
 * @author Musuc
 *
 */
public class MultiplicationTable2 {
	public static void main(String[] args) {
		for(int n=1;n<10;n++) {
			for(int m=1;m<n+1;m++ ) {
				System.out.print(m+"*"+n+"="+(m*n)+"\t");
			}
			System.out.println();
		}
	}

}
