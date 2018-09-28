package DijkstraAgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	private String name;
	private double distance = Double.MAX_VALUE;
	private Vertex predecessor;
	private boolean visited;
	private List<Edge> adjacenciesList;

	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}

	public void addNeighbours(Edge edge) {
		this.adjacenciesList.add(edge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String toString() {
		return this.getName();
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Edge> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		// TODO Auto-generated method stub
		return Double.compare(this.distance, otherVertex.getDistance());
	}

}
