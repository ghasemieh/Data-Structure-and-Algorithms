package Kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {
	public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList) {

		DisjointSet disjoint = new DisjointSet(vertexList);
		List<Edge> mst = new ArrayList<>();
		Collections.sort(edgeList);

		for (Edge edge : edgeList) {

			Vertex u = edge.getStartVertex();
			Vertex v = edge.getTargetVertex();

			// Check if the new edge creates a cycle in the tree; if not add it to mst
			if (disjoint.find(u.getNode()) != disjoint.find(v.getNode())) {
				mst.add(edge);
				disjoint.union(u.getNode(), v.getNode());
			}
		}

		for (Edge edge : mst) {
			System.out.print(edge.getStartVertex() + " " + edge.getTargetVertex() + " -- ");
		}
	}
}
