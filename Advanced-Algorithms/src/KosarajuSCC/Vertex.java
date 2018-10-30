package KosarajuSCC;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int id;
	private String name;
	private boolean visited;
	private List<Vertex> adjanciesList;
	private int componentId; // same SCC has a same componentId

	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
		this.adjanciesList = new ArrayList<>();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Vertex> getAdjanciesList() {
		return adjanciesList;
	}

	public void setAdjanciesList(List<Vertex> adjanciesList) {
		this.adjanciesList = adjanciesList;
	}

	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public void addNeighbour(Vertex vertex) {
		adjanciesList.add(vertex);
	}

}
