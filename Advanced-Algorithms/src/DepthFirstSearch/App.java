package DepthFirstSearch;

public class App {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		Vertex G = new Vertex("G");
		Vertex H = new Vertex("H");
		
		A.addNeighbourVertex(B);
		A.addNeighbourVertex(F);
		A.addNeighbourVertex(G);
		B.addNeighbourVertex(C);
		B.addNeighbourVertex(D);
		D.addNeighbourVertex(E);
		G.addNeighbourVertex(H);
		
		dfs.dfsStack(A);
		dfs.dfsRecursive(A);
	}

}
