package MazeSolver;

public class App {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader(
				"C:\\Users\\appli\\Google Drive\\Data Science\\Udemy\\Advanced Algorithms in Java\\AdvancedAlgorithmsJava\\Sourcecode\\MazeSolver\\MazeSolver\\map.txt",
				12, 12);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartPositionRow(),
				fileReader.getStartPositionCol());
		mazeSolver.findWayOut();
	}

}
