package DijkstraAgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

	public void computePaths(Vertex source) {
		source.setDistance(0);
		PriorityQueue<Vertex> q = new PriorityQueue();
		q.add(source);
		while (!q.isEmpty()) {
			Vertex current = q.poll();
			for (Edge e : current.getAdjacenciesList()) {
				Vertex target = e.getTargetVertex();
				double newDistance = current.getDistance() + e.getWeight();
				if (newDistance < target.getDistance()) {
					q.remove(target);
					target.setDistance(newDistance);
					target.setPredecessor(current);
					q.add(target);
				}
			}
		}
	}

	public List<Vertex> getShortestPathTo(Vertex target) {
		List<Vertex> shortestPath = new ArrayList<>();
		for (Vertex vertex = target; vertex != null; vertex = vertex.getPredecessor()) {
			shortestPath.add(vertex);
		}
		Collections.reverse(shortestPath);
		return shortestPath;
	}
}
