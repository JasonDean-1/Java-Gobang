public class Chessboard
{
	private String[][] board;
	public static final int BOARD_SIZE = 22;

	/**
	 * 初始化棋盘
	 * 
	 * @return void
	 */
	public void initBoard()
	{
		board = new String[BOARD_SIZE][BOARD_SIZE];
		for (int i = 0; i < BOARD_SIZE; i++)
		{
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				board[i][j] = "+";
			}
		}
	}

	/**
	 * 在控制台输出棋盘的方法
	 * 
	 * @return void
	 */
	public void printBoard()
	{
		for (int i = 0; i < BOARD_SIZE; i++)
		{
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}

	/**
	 * 返回棋盘
	 * 
	 * @return String[][]
	 */
	public String[][] getBoard()
	{
		return this.board;
	}

	/**
	 * 给棋盘位置赋值
	 * 
	 * @param posX
	 *            X坐标
	 * @param posY
	 *            Y坐标
	 * @param chessman
	 *            棋子
	 */
	public void setBoard(int axisX, int axisY, String chessman)
	{
		this.board[axisX][axisY] = chessman;
	}
}