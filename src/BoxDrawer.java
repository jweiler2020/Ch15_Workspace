import javax.swing.*;
import java.awt.*;

public class BoxDrawer extends JPanel
{
	int boxType;
	Color color;
	
	public void setBoxType(int boxType)
	{
		this.boxType = boxType;
	}
	
	public void setBoxColor(Color color)
	{
		this.color = color;
	}
	
	public void drawBox(Graphics g)
	{
		int x = getWidth()/4;
		int y = getHeight()/4;
		int w = getWidth()/2;
		int h = getHeight()/2;
		g.setColor(color);
		int fontSize = w/15;
		g.setFont(new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, fontSize));
		switch(boxType)
		{
			case 0: // 000
				g.drawRect(x, y, w, h);
				break;
			case 1: // 001
				g.fillRect(x, y, w, h);
				break;
			case 2: // 010
				g.drawRoundRect(x, y, w, h, 50, 50);
				break;
			case 3: // 011
				g.fillRoundRect(x, y, w, h, 50, 50);
				break;
			case 4: // 100
				g.draw3DRect(x, y, w, h, true);
				break;
			case 5: // 101
				g.fill3DRect(x, y, w, h, true);
				break;
			default:
				g.drawString("Error: Cannot have both 3D rect and round rect", w/2-24*fontSize/4, h);
				break;
		}
	}
	
	public void paintComponent(Graphics g)
	{
		if(color.equals(Color.WHITE))
			g.setColor(Color.GRAY);
		else
			g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		drawBox(g);
	}
}
