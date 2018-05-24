import java.awt.*;
import javax.swing.*;

public class Mypanel extends JPanel{
	public Mypanel() {

		setLayout(new BorderLayout());

		setBackground (new Color(0,0,0));
		
		JButton button1 = new JButton();
		JButton button2 = new JButton("button2");

		button1.setText("button");
		button1.addActionListener(new ActListener());
		button2.addActionListener(new ActListener2());

		add(button1,BorderLayout.CENTER);
		add(button2,BorderLayout.SOUTH);
	}
}
