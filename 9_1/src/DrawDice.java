import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawDice extends JFrame{
	
	public DrawDice()
	{
		super();
		MyPanel panel = new MyPanel();
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("snow man face");
		setVisible(true);
		add(panel);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawDice dd = new DrawDice();
		dd.setVisible(true);
	}


}
class MyPanel extends JPanel implements ActionListener{
	JButton button;
	public MyPanel() {
		button = new JButton("´øÁö±â");
		button.addActionListener(this);
		add(button);
	}
	
	public void paint(Graphics g) {
		Random random = new Random();
		int dice_surface1 = random.nextInt(6)+1;
		int dice_surface2= random.nextInt(6)+1;
		
		Dice dice1= new Dice(80,200,Color.RED,dice_surface1);
		dice1.paintComponent(g);
		Dice dice2 =new Dice(220,200,Color.RED,dice_surface2);
		dice2.paintComponent(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//if(e.getSource()==button)
			repaint();
	}

}
class Dice {
	int x,y,surface;
	Color c;

	public Dice(int _x,int _y, Color _c, int _surface) {
		x=_x; y=_y; c=_c; surface=_surface;	

	}
	public void paintComponent(Graphics g) {
		g.setColor(c);
		
		g.drawRect(x, y, 100, 100);
		switch(surface) {
		case 1:		
			g.fillOval(x+45, y+45, 10, 10);
			break;
		case 2:
			g.fillOval(x+20, y+20, 10, 10);
			g.fillOval(x+70, y+70, 10, 10);
			break;
		case 3:
			g.fillOval(x+20, y+20, 10, 10);
			g.fillOval(x+45, y+45, 10, 10);
			g.fillOval(x+70, y+70, 10, 10);
			break;	
		case 4:
			g.fillOval(x+20, y+20, 10, 10);
			g.fillOval(x+20, y+70, 10, 10);
			g.fillOval(x+70, y+20, 10, 10);
			g.fillOval(x+70, y+70, 10, 10);	
			break;
		case 5:
			g.fillOval(x+70, y+60, 10, 10);
			g.fillOval(x+70, y+60, 10, 10);
			g.fillOval(x+70, y+60, 10, 10);
			g.fillOval(x+70, y+60, 10, 10);
			g.fillOval(x+70, y+60, 10, 10);
			g.fillOval(x+45, y+45, 10, 10);
			break;
		case 6:
			g.fillOval(x+20, y+25, 10, 10);
			g.fillOval(x+20, y+45, 10, 10);
			g.fillOval(x+20, y+65, 10, 10);
			g.fillOval(x+70, y+25, 10, 10);
			g.fillOval(x+70, y+45, 10, 10);
			g.fillOval(x+70, y+65, 10, 10);
			break;
			default: System.err.println("Out of Boundary");
		}
	}
	
}