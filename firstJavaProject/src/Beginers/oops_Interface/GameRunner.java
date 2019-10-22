package Beginers.oops_Interface;

public class GameRunner {

	public static void main(String[] args) {

		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		// MarioGame game = new MarioGame();

		// GamingConsole game = new MarioGame();
		// ChessGame game = new ChessGame();

		// GamingConsole game = new ChessGame();

		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();

		}

	}

}
