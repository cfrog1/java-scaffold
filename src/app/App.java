package app;

public class App {

	public String run() {
		CodeGenerator codeGenerator = new TestCodeGenerator();
		Input input = new CommandLineInput();
		Game game = new Game(codeGenerator, input);
		game.start();
		return null;
	}
}

// Assumptions: for scoring, I'm explicitly following the mastermind rules:
// https://www.wikihow.com/Play-Mastermind