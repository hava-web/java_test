package TEST;

public class TestPlayer {
	public static void main(String[] args)
	 {
	 BaseballPlayer aCatcher = new BaseballPlayer(12, .218);
	 BaseballPlayer aShortstop = new BaseballPlayer(31, .385);
	 aCatcher.showPlayer();
	 aShortstop.showPlayer();
	 BaseballPlayer anOutfielder = new BaseballPlayer(44, .505);
	 anOutfielder.showPlayer();
	 aCatcher.showPlayer();
	 BaseballPlayer aTester = new BaseballPlayer(50, .22);
	 aTester.showPlayer();
	 }
}
