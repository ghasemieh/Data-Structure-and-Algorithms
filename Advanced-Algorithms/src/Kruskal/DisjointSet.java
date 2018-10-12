package Kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	private int nodeCount = 0;
	private int setCount = 0;
	private List<Node> rootNodes; // Representative

	public DisjointSet(List<Vertex> vertexes) {
		rootNodes = new ArrayList<>(vertexes.size());
		makeSets(vertexes);
	}

	private void makeSets(List<Vertex> vertexes) {
		for (Vertex v : vertexes) {
			makeSet(v);
		}
	}

	private void makeSet(Vertex v) {
		Node n = new Node(0, rootNodes.size(), null);
		v.setNode(n);
		this.rootNodes.add(n);
		this.nodeCount++;
		this.setCount++;
	}

	public int find(Node n) {
		Node currentNode = n;
		while (currentNode.getParent() != null) {
			currentNode = currentNode.getParent();
		}
		Node rootNode = currentNode;

		// path compression
		currentNode = n;
		while (currentNode != rootNode) { // path compression
			Node temp = currentNode.getParent();
			currentNode.setParent(rootNode);
			currentNode = temp;
		}
		return rootNode.getId();
	}

	public void union(Node node1, Node node2) {
		int rootIndex1 = find(node1);
		int rootIndex2 = find(node2);

		if (rootIndex1 == rootIndex2) {
			return;
		}

		Node root1 = this.rootNodes.get(rootIndex1);
		Node root2 = this.rootNodes.get(rootIndex2);

		if (root1.getRank() < root2.getRank()) {
			root1.setParent(root2);
		} else if (root1.getRank() > root2.getRank()) {
			root2.setParent(root1);
		} else {
			root2.setParent(root1);
			root1.setRank(root1.getRank() + 1);
		}
		this.setCount--;
	}
}
