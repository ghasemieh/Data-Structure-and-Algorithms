package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		CycleDetection c = new CycleDetection();
		List<Vertex> graph = new ArrayList<>();
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		A.addNeighbour(B);
		A.addNeighbour(C);
		B.addNeighbour(C);
		D.addNeighbour(A);
		D.addNeighbour(E);
		E.addNeighbour(F);
		F.addNeighbour(D);

		graph.add(A);
		graph.add(B);
		graph.add(C);
		graph.add(D);
		graph.add(E);

		for (int i = 0; i < graph.size(); i++) {
			if(!graph.get(i).isVisited()) {
				c.dfs(graph.get(i));
			}
		}
	}
}
