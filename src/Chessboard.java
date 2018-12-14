import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Chessboard extends JFrame
{
	private ChessSquarePanel[][] board = new ChessSquarePanel[8][8];
	private int[][] pos = new int[8][];
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
		addQueens(new ArrayList<>());
		for(int[] p : pos)
		{
			board[p[0]][p[1]].setFilled(true);
		}
	}
	
	// Board is a list of queen positions
	private boolean addQueens(ArrayList<int[]> pos)
	{
		if(pos.size() == 8)
		{
			pos.toArray(this.pos);
			return true;
		}

		boolean[][] protect = new boolean[8][8];
		for(int[] p : pos)
		{
			protect = fillRow(protect, p[0]);
			protect = fillColumn(protect, p[1]);
			protect = fillDiagRight(protect, p[0], p[1]);
			protect = fillDiagLeft(protect, p[0], p[1]);
		}

		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if(!protect[i][j])
				{
					pos.add(new int[]{i, j});
					boolean done = addQueens(pos);
					if(done)
						return true;
					else
						pos.remove(pos.size()-1);
				}
			}
		}
		return false;
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
	
	private boolean[][] fillDiagRight(boolean[][] b, int row, int col)
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
	
	private boolean[][] fillDiagLeft(boolean[][] b, int row, int col)
	{
		if(row+col > 7)
		{
			for(int i = col-(7-row), j = 7; i < 8; i++, j--)
			{
				b[i][j] = true;
			}
		}
		else
		{
			for(int i = 0, j = (row+col); j >= 0; i++, j--)
			{
				b[i][j] = true;
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
