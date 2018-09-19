package DepthFirstSearch;

import java.util.Stack;

public class DFS {

	public void dfsStack(Vertex vertex) {
		Stack<Vertex> stack;
		stack = new Stack<>();
		vertex.setVisited(true);
		stack.push(vertex);
		while (!stack.isEmpty()) {
			Vertex actual = stack.pop();
			System.out.println(actual.getName());
			for (Vertex v : actual.getNeighbourList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					stack.push(v);
				}
			}
		}
	}

	public void dfsRecursive(Vertex vertex) {
		vertex.setVisited(true);
		System.out.println(vertex.getName());
		for (Vertex v : vertex.getNeighbourList()) {
			if (!v.isVisited()) {
				dfsRecursive(v);
			}
		}
	}

}
