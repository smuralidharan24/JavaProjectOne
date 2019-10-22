package Tips;

class Player {

	private String name;
	private static int count = 0; // when declared as static the value is not unique to each class instance but it
									// remains common for both the instance

	public Player(String name) {
		super();
		this.name = name;
		count++;
		System.out.println(name);
		System.out.println(count);
	}

	public static int getCount() { // static method can be called by the name of the class rather than calling by
									// instance
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Murali");
		Player player2 = new Player("Pranav");
		System.out.println(Player.getCount());
		// System.out.println(player2.getCount());

	}

}
