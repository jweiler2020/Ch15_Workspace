import javax.swing.*;
import java.awt.*;

public class NumberFourA extends JFrame
{
	public NumberFourA()
	{
		super("Drawings");
		Container c = getContentPane();
		c.setBackground(Color.BLACK);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.WHITE);
		g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 50));
		g.fillRect(w/2, h/2, w, h);
		g.drawString("A", w/4-10, h/4+20);
		g.drawString("A", 3*w/4-10, h/4+20);
		g.drawString("A", w/4-10, 3*h/4+20);
		g.setColor(Color.BLACK);
		g.drawString("A", 3*w/4-10, 3*h/4+20);
	}
	public static void main(String[] args)
	{
		NumberFourA window = new NumberFourA();
		window.setBounds(100, 100, 200, 200);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}