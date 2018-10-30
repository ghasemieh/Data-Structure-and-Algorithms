package PrimAlgorithm;

public class Edge implements Comparable<Edge> {
	private double wieght;
	private Vertex startVertex;
	private Vertex targetVertex;

	public Edge(Vertex startVertex, Vertex targetVertex, double wieght) {
		this.wieght = wieght;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public double getWieght() {
		return wieght;
	}

	public void setWieght(double wieght) {
		this.wieght = wieght;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	@Override
	public int compareTo(Edge otherEdge) {
		return Double.compare(this.wieght, otherEdge.wieght);
	}

}
