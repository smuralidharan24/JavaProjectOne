package Beginers.oops_Interface;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move piece Forward");

	}

	@Override
	public void down() {
		System.out.println("Move piece below");

	}

	@Override
	public void left() {
		System.out.println("Move piece left");

	}

	@Override
	public void right() {
		System.out.println("Move piece Right");

	}

}
