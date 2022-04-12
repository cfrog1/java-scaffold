package app;

public class App {

	public String run() {
		Game game = new Game();
		game.start();
		return null;
	}
}

// Assumptions: for scoring, I'm explicitly following the mastermind rules:
// https://www.wikihow.com/Play-Mastermind