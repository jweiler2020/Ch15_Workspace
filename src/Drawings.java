import java.awt.*;
import javax.swing.*;
public class Drawings extends JFrame
{
	public Drawings()
	{
		super("Drawings");
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.BLACK);
		/* 1
		g.setColor(Color.RED);
		g.drawRect(w/4, h/4, w/2, h/2);
		g.drawString("This is a rectangle!", w/2-53, h/2);
		*/
		/* 2a
		g.drawRect(w/4, h/2, w/2, h/4);
		g.drawOval(w/2-w/8, h/4, w/4, h/4);
		*/
		/* 2b
		g.fillRoundRect(w/4, h/4, w/2, h/2, w/4, h/4);
		g.setColor(Color.WHITE);
		g.fillOval(w/4, h/4, w/4, h/4);
		g.fillOval(w/2, h/4, w/4, h/4);
		g.fillOval(w/4, h/2, w/4, h/4);
		g.fillOval(w/2, h/2, w/4, h/4);
		*/
		/* 2c
		g.fillPolygon(new int[]{w/2, 3*w/4, w/2, w/4}, new int[]{h/4, h/2, 3*h/4, h/2}, 4);
		*/
		/* 2d
		g.drawOval(w/4-w/16, h/2-h/16, w/8, h/8);
		g.drawOval(w/4-w/8, h/2-h/8, w/4, h/4);
		g.drawOval(3*w/4-w/16, h/2-h/16, w/8, h/8);
		g.drawOval(3*w/4-w/8, h/2-h/8, w/4, h/4);
		g.drawLine(w/4,h/2-h/8, 3*w/4, h/2-h/8);
		g.drawLine(w/4,h/2+h/8, 3*w/4, h/2+h/8);
		*/
		g.drawOval(w/2-w/16, h/2-h/16, w/8, h/8);
		g.drawOval(w/2-w/16, h/2+h/32, w/8, h/8);
		g.drawOval(w/2-w/16, h/2-5*h/32, w/8, h/8);
		g.drawOval(w/2-9*w/64, h/2-7*h/64, w/8, h/8);
		g.drawOval(w/2-9*w/64, h/2-h/64, w/8, h/8);
		g.drawOval(w/2+w/64, h/2-7*h/64, w/8, h/8);
		g.drawOval(w/2+w/64, h/2-h/64, w/8, h/8);
		g.setFont(new Font(Font.SERIF, Font.BOLD, w/50+h/50));
		g.drawString("Sunshines", w/2-40, 3*h/4);
	}
	public static void main(String[] args)
	{
		Drawings window = new Drawings();
		window.setBounds(100, 100, 200, 200);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}