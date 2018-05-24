package Practice9_1;

import javax.swing.*;
import java.awt.*;

public class Ppp extends JPanel {

	public void paintComponent(Graphics temp)
	{
		super.paintComponent(temp);
		
		temp.drawRect(50,50,50,50);
		temp.drawOval(50,50,50,50);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
