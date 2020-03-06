package world;

public abstract class AbstractPlayer {
	// CREATING ABSTRACT CLASS BECAUSE IT DOES NOT REQUIRE METHODS TO RETURN VALUE
	// WE CAN USE CHILD CLASS AND OVERRIDE NEW METHODS OF OUR CHOICE

	// USE OF DATA ENCAPSULATION FOR SECURING INFORMATIONS

	protected String name;
	protected String title;
	protected int matches;

	// USE OF GETTERS

	public String getName() {
		return name;
	}

	// USE OF SETTERS
	// SETTING NAME

	public void setName(String name) {
		// THIS METHOD IS USED TO SET VALUES IN LOCAL VARIABLE

		this.name = name;
	}

	public String getTitle() {
		return title;
	}
	// SETTING TITLE

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMatches() {
		return matches;
	}

	// SETTING MATCHES
	public void setMatches(int matches) {
		this.matches = matches;
	}

	// OVERRIDE
	public String toString() {
		return "Name   : " + this.name + "\nTitle  : " + this.title + "\nMatches: " + this.matches;
	}

}
