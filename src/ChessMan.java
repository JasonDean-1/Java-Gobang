
public class Chessman
{
	private String chessman;
	public static final Chessman BLACK = new Chessman("��");
	public static final Chessman WHITE = new Chessman("*");

	/**
	 * ˽�й�����
	 */
	private Chessman(String chessman)
	{
		this.chessman = chessman;
	}

	/**
	 * @return String ������߰���
	 */
	public String getChessman()
	{
		return this.chessman;
	}
}