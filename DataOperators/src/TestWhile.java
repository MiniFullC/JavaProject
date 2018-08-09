
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+4+...+100的累加的和，5050
		
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
			sum = sum + i;
			i++;
			
		}
		
		System.out.println(sum);
	}

}
