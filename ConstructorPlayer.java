package world;

// USE OF INHERITANCE, UPDATING INSTANCE VARIABLE OF PARENT CLASS
public class ConstructorPlayer extends AbstractPlayer {
	public ConstructorPlayer(String name, String title, int matches) {
		// SETTING VALUSES USING THIS METHOD IN LOCAL VARIABLE

		this.name = name;
		this.title = title;
		this.matches = matches;
	}
}
