package MazeSolver;

public class App {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader("C:\\Users\\appli\\Desktop\\map.txt", 10, 10);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(),fileReader.getStartPositionCol());
		mazeSolver.findWayOut();
	}

}
