import javax.swing.*;
import java.awt.*;

public class NumberFourB extends JFrame
{
	public NumberFourB()
	{
		super("Drawings");
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new GridLayout(2, 2));
		c.add(new LetterPanel(Color.BLACK, 'A'));
		c.add(new LetterPanel(Color.BLACK, 'A'));
		c.add(new LetterPanel(Color.BLACK, 'C'));
		c.add(new LetterPanel(Color.WHITE, 'P'));
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.BLACK);
	}
	public static void main(String[] args)
	{
		NumberFourB window = new NumberFourB();
		window.setBounds(100, 100, 200, 200);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}