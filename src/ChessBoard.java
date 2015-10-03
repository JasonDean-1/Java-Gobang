public class Chessboard
{
	private String[][] board;
	public static final int BOARD_SIZE = 22;

	/**
	 * ��ʼ������
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
	 * �ڿ���̨������̵ķ���
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
	 * ��������
	 * 
	 * @return String[][]
	 */
	public String[][] getBoard()
	{
		return this.board;
	}

	/**
	 * ������λ�ø�ֵ
	 * 
	 * @param posX
	 *            X����
	 * @param posY
	 *            Y����
	 * @param chessman
	 *            ����
	 */
	public void setBoard(int axisX, int axisY, String chessman)
	{
		this.board[axisX][axisY] = chessman;
	}
}