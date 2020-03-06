package world;

class SportsEntertainment {
	public static void main(String[] args) {
		ConstructorPlayer[] a = new ConstructorPlayer[3];
		ConstructorPlayer p1 = new ConstructorPlayer("Randy Orton", "WWE Champion", 100);
		a[0] = p1;

		// PLAYER 2

		ConstructorPlayer p2 = new ConstructorPlayer("Goldberg", "Universal Champion", 250);
		a[1] = p2;

		// PLAYER 3

		ConstructorPlayer p3 = new ConstructorPlayer("Brock Lesnar", "WWE World Heavy Weight Champion", 400);
		a[2] = p3;
		// INPUT FROM COMMAND LINE

		String arg = args[0];

		// CHECKING VALUES

		for (ConstructorPlayer x : a) {
			if (arg.equals(x.getName())) {
				// PRINTING VALUE OF x

				System.out.println(x);
			}
		}
	}

}