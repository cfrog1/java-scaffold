package app;

public class App {

	public String run() {
		CodeGenerator codeGenerator = new TestCodeGenerator();
		Game game = new Game(codeGenerator);
		game.start();
		return null;
	}
}

// Assumptions: for scoring, I'm explicitly following the mastermind rules:
// https://www.wikihow.com/Play-Mastermind