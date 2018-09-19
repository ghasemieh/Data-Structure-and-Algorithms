package DepthFirstSearch;

import java.util.ArrayList;

public class Vertex {
	private String name;
	private boolean visited;
	private ArrayList<Vertex> neighbourList;

	public Vertex(String i) {
		super();
		this.name = i;
		this.neighbourList = new ArrayList<>();
	}

	public void addNeighbourVertex(Vertex vertex) {
		this.neighbourList.add(vertex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public ArrayList<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(ArrayList<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

}
