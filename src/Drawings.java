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
		g.setColor(Color.RED);
		g.drawRect(w/4, h/4, w/2, h/2);
	}
	public static void main(String[] args)
	{
		Drawings window = new Drawings();
		window.setBounds(100, 100, 200, 200);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
