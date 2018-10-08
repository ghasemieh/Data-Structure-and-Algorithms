package BellmanFord;

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
		/*
		 * Vertex F = new Vertex("F"); Vertex G = new Vertex("G");
		 */

		vertexList.add(A);
		vertexList.add(B);
		vertexList.add(C);
		vertexList.add(D);
		vertexList.add(E);
		/*
		 * vertexList.add(F); vertexList.add(G);
		 */

		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge(1, A, B));
		edgeList.add(new Edge(1, A, C));
		edgeList.add(new Edge(1, C, D));
		edgeList.add(new Edge(2, D, B));
		edgeList.add(new Edge(-13, D, A));

		BellmanFord bellman = new BellmanFord(edgeList, vertexList);
		bellman.BellmanFord(A);
		//bellman.shortestPathTo(D);
	}

}
