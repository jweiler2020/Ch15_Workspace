import javax.swing.*;
import java.awt.*;

public class ChessSquarePanel extends JPanel
{
	Color c;
	
	public ChessSquarePanel(Color col)
	{
		c = col;
	}
	
	public void paintComponent(Graphics g)
	{
		int w = getWidth();
		int h = getHeight();
		g.setColor(c);
		g.fillRect(0, 0, w, h);
	}
}
