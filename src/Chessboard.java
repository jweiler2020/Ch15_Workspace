import javax.swing.*;
import java.awt.*;

public class Chessboard extends JFrame
{
	ChessSquarePanel[][] board = new ChessSquarePanel[8][8];
	public Chessboard()
	{
		Container c = getContentPane();
		c.setLayout(new GridLayout(8, 8));
		Color col;
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				col = (i+j)%2==0 ? Color.WHITE : Color.BLACK;
				board[i][j] = new ChessSquarePanel(col);
				c.add(board[i][j]);
			}
		}
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
	}
	
	public static void main(String[] args)
	{
		Chessboard window = new Chessboard();
		window.setBounds(100, 100, 400, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
