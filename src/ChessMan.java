
public class Chessman
{
	private String chessman;
	public static final Chessman BLACK = new Chessman("●");
	public static final Chessman WHITE = new Chessman("*");

	/**
	 * 私有构造器
	 */
	private Chessman(String chessman)
	{
		this.chessman = chessman;
	}

	/**
	 * @return String 黑棋或者白棋
	 */
	public String getChessman()
	{
		return this.chessman;
	}
}