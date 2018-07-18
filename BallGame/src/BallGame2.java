import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images.desk.png");
	
	double x=100;
	double y=100;
	boolean right = true; //方向
	
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);

		
		
		if(right) {
			x = x +10;
		}else {
			x = x-10;
		}
		
		if(x>856-40-30) { 
			right = false;
		}
		if(x<40) {
			right = true;
		}
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50, 50);
		setVisible(true);
		
		// 重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//main是程序执行的入口
	public static void main(String[] args){
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
	
}
