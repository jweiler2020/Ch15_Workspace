import javax.swing.*;
import java.awt.*;

public class ChessSquarePanel extends JPanel
{
	private Color color;
	private boolean filled;
	
	public ChessSquarePanel(Color col, boolean fil)
	{
		color = col;
		filled = fil;
	}
	
	public void setFilled(boolean fil) { filled = fil; }
	
	public void paintComponent(Graphics g)
	{
		int w = getWidth();
		int h = getHeight();
		g.setColor(color);
		g.fillRect(0, 0, w, h);
		if(filled)
		{
			if(color == Color.WHITE)
				g.setColor(Color.BLACK);
			else
				g.setColor(Color.WHITE);
			g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, w/2));
			g.drawString("Q", w/2-w/5, h/2+h/5);
		}
	}
}
