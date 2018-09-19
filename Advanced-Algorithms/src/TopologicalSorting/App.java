package TopologicalSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
	public static void main(String[] args) {
		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
		List<Vertex> graph = new ArrayList<>();
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		A.addNeighbour(B);
		A.addNeighbour(C);
		B.addNeighbour(D);
		D.addNeighbour(C);
		C.addNeighbour(E);

		graph.add(A);
		graph.add(B);
		graph.add(C);
		graph.add(D);
		graph.add(E);
/*		graph.add(new Vertex("0"));
		graph.add(new Vertex("1"));
		graph.add(new Vertex("2"));
		graph.add(new Vertex("3"));
		graph.add(new Vertex("4"));
		graph.add(new Vertex("5"));
		
		graph.get(2).addNeighbour(graph.get(3));
		
		graph.get(3).addNeighbour(graph.get(1));
		
		graph.get(4).addNeighbour(graph.get(0));
		graph.get(4).addNeighbour(graph.get(1));
		
		graph.get(5).addNeighbour(graph.get(0));
		graph.get(5).addNeighbour(graph.get(2));*/
		for (int i = 0; i < graph.size(); i++) {
			if(!graph.get(i).isVisited()) {
				topologicalOrdering.dfs(graph.get(i));
			}
		}
		Stack<Vertex> stack = topologicalOrdering.getStack();
		for(int i=0;i<graph.size();i++) {
			Vertex vertex = stack.pop();
			System.out.print(vertex.getData()+" -> ");
		}
	}
}
