package KosarajuSCC;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertex> vertexList;
	private List<Edge> edgeList;

	public Graph() {

	}

	public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}

	public Graph getTransposeGraph() {
		Graph transposeGraph = new Graph();
		List<Vertex> transposeVertexList = new ArrayList<>();
		for (Vertex v : this.vertexList) {
			transposeVertexList.add(v);
		}
		for (Edge e : this.edgeList) {
			transposeVertexList.get(transposeVertexList.indexOf(e.getTargetVertex())).addNeighbour(e.getStartVertex());
		}
		transposeGraph.setVertexList(transposeVertexList);
		return transposeGraph;
	}

}
