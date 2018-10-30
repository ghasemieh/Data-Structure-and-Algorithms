package PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimAlgorithm {

	private List<Vertex> unvisitedVertexes;
	private List<Edge> spanningTree;
	private PriorityQueue<Edge> edgeHeap;
	private double fullCost;

	public PrimAlgorithm(List<Vertex> unvisitedVertexes) {
		this.unvisitedVertexes = unvisitedVertexes;
		this.spanningTree = new ArrayList<>();
		this.edgeHeap = new PriorityQueue<>();
	}

	public void prim(Vertex vertex) {
		this.unvisitedVertexes.remove(vertex);
		while (!unvisitedVertexes.isEmpty()) {
			for (Edge e : vertex.getAdjacencies()) {
				if (this.unvisitedVertexes.contains(e.getTargetVertex())) {
					edgeHeap.add(e);
				}
			}
			Edge minEdge = this.edgeHeap.remove();
			this.spanningTree.add(minEdge);
			this.fullCost += minEdge.getWieght();
			vertex = minEdge.getTargetVertex();
			this.unvisitedVertexes.remove(vertex);
		}
	}

	public void showMST() {
		System.out.println("Min cost: " + fullCost);
		for (Edge e : spanningTree) {
			System.out.println(e.getStartVertex() + " - " + e.getTargetVertex());
		}
	}
}
