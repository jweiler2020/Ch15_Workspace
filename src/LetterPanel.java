import javax.swing.*;
import java.awt.*;

public class LetterPanel extends JPanel
{
	Color c;
	char ch;
	
	public LetterPanel(Color col, char cha)
	{
		c = col;
		ch = cha;
	}
	
	public void paintComponent(Graphics g)
	{
		int w = getWidth();
		int h = getHeight();
		g.setColor(c);
		g.fillRect(0, 0, w, h);
		if(c.equals(Color.WHITE))
			g.setColor(Color.BLACK);
		else
			g.setColor(Color.WHITE);
		g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 50));
		g.drawChars(new char[]{ch}, 0, 1, w/2-10, h/2);
	}
}
