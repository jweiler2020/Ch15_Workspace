import javax.swing.*;
import java.awt.*;

public class Chessboard extends JFrame
{
	private ChessSquarePanel[][] board = new ChessSquarePanel[8][8];
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
				board[i][j] = new ChessSquarePanel(col, false);
				c.add(board[i][j]);
			}
		}
		fillBoard();
	}
	
	private void fillBoard()
	{
		/*
		int[] arr = {4, 0, 7, 3, 1, 6, 2, 5};
		for(int i = 0; i < 8; i++)
		{
			board[i][arr[i]].setFilled(true);
		}
		*/
		addQueens(new int[][]{{2, 3}}, 1);
	}
	
	// Board is a list of queen positions
	private void addQueens(int[][] board, int numQueens)
	{
		boolean[][] protect = new boolean[8][8];
		for(int n = 0; n < numQueens; n++)
		{
			protect = fillRow(protect, board[n][1]);
			protect = fillColumn(protect, board[n][0]);
			//protect = fillDiagDownRight(protect, board[n][1], board[n][0]);
			protect = fillDiagDownLeft(protect, board[n][1], board[n][0]);
		}
		
		
		
		// TODO: remove
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				this.board[i][j].setFilled(protect[i][j]);
			}
		}
	}
	
	private boolean[][] fillRow(boolean[][] b, int row)
	{
		for(int j = 0; j < b[0].length; j++)
		{
			b[row][j] = true;
		}
		return b;
	}
	
	private boolean[][] fillColumn(boolean[][] b, int col)
	{
		for(int i = 0; i < b.length; i++)
		{
			b[i][col] = true;
		}
		return b;
	}
	
	private boolean[][] fillDiagDownRight(boolean[][] b, int row, int col)
	{
		if (row > col)
		{
			for(int i = row-col, j = 0; i < 8; i++, j++)
			{
				b[i][j] = true;
			}
		}
		else if(col > row)
		{
			for(int i = 0, j = col-row; j < 8; i++, j++)
			{
				b[i][j] = true;
			}
		}
		else
		{
			for(int i = 0, j = 0; i < 8; i++, j++)
			{
				b[i][j] = true;
			}
		}
		return b;
	}
	
	private boolean[][] fillDiagDownLeft(boolean[][] b, int row, int col)
	{
		if(row > col)
		{
			if(row+col < 8)
			{
				for (int i = row + col, j = 0; i >= 0 && j < 8; i--, j++)
				{
					b[i][j] = true;
				}
			}
			else
			{
				for(int i = 7, j = )
			}
		}
		return b;
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
