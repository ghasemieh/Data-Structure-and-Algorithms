package Kruskal;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Vertex> vertexList = new ArrayList<>();
		
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		Vertex G = new Vertex("G");
		Vertex H = new Vertex("H");

		vertexList.add(A);
		vertexList.add(B);
		vertexList.add(C);
		vertexList.add(D);
		vertexList.add(E);
		vertexList.add(F);
		vertexList.add(G);
		vertexList.add(H);

		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge(A, B, 3));
		edgeList.add(new Edge(A, C, 2));
		edgeList.add(new Edge(A, D, 5));
		edgeList.add(new Edge(B, F, 13));
		edgeList.add(new Edge(B, D, 2));
		edgeList.add(new Edge(C, E, 5));
		edgeList.add(new Edge(C, D, 2));
		edgeList.add(new Edge(D, E, 4));
		edgeList.add(new Edge(D, F, 6));
		edgeList.add(new Edge(D, G, 3));
		edgeList.add(new Edge(E, G, 6));
		edgeList.add(new Edge(F, G, 2));
		edgeList.add(new Edge(F, H, 3));
		edgeList.add(new Edge(G, H, 6));

		KruskalAlgorithm kruskalAlgorithm = new KruskalAlgorithm();
		kruskalAlgorithm.spanningTree(vertexList, edgeList);

	}

}
