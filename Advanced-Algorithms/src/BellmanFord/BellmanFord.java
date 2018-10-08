package BellmanFord;

import java.util.List;

public class BellmanFord {
	private List<Edge> edgeList;
	private List<Vertex> vertexList;

	public BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public void BellmanFord(Vertex sourceVertex) {
		sourceVertex.setDistance(0);
		for (int i = 0; i < vertexList.size(); ++i) {
			for (Edge e : edgeList) {
				Vertex u = e.getStartVertex();
				Vertex v = e.getTargetVertex();

				if (u.getDistance() == Double.MAX_VALUE)
					continue;
				double newDistance = u.getDistance() + e.getWeight();
				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}
		for (Edge e : edgeList) {
			Vertex u = e.getStartVertex();
			Vertex v = e.getTargetVertex();
			if (v.getDistance() > u.getDistance() + e.getWeight()) {
				System.out.println("There is a negative loop between "+ e.getStartVertex().getName() + " and " + e.getTargetVertex().getName());
			}
		}
	}

	public void shortestPathTo(Vertex target) {
		if (target.getDistance() == Double.MAX_VALUE) {
			System.out.println("No route exists to the target");
		} else {
			System.out.println("The cost for "+ target.getName()  +" is: "+ target.getDistance());
			Vertex actualVertex = target;
			while(actualVertex.getPreviousVertex() != null) {
				System.out.print(actualVertex + " -> ");
				actualVertex = actualVertex.getPreviousVertex();
			}
			System.out.print(actualVertex);
		}
	}
}
