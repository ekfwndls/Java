import Practice9_1.Ppp;
import javax.swing.*;
import java.awt.*;

public class DrawPicture  
{
	 public static void main(String[] args) {
		int width = 500;
		int height = 500;
			
		JFrame frame = new JFrame("title");
		frame.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel(new BorderLayout());
		
		
		panel1.add(button1);
		panel1.add(button2);
		
		
		frame.add(panel1);
		
		frame.setTitle("title");
		
		frame.setVisible(true);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
