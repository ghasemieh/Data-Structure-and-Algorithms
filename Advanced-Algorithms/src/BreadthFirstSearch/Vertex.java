package BreadthFirstSearch;

import java.awt.List;
import java.util.ArrayList;

public class Vertex {
	private int data;
	private boolean visited;
	private ArrayList<Vertex> neighbourList;

	public Vertex(int data) {
		this.data = data;
		this.neighbourList = new ArrayList<>();

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
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
	
	public void addNeighbourVertex(Vertex vertex) {
		this.neighbourList.add(vertex);
	}

	public String toString() {
		return "" + this.data;
	}
}
