package DijkstraAgorithm;

public class App {

	public static void main(String[] args) {
		Vertex v0 = new Vertex("A");
		Vertex v1 = new Vertex("B");
		Vertex v2 = new Vertex("C");
		Vertex v3 = new Vertex("D");
		Vertex v4 = new Vertex("E");
		
		v0.addNeighbours(new Edge(1,v0,v1));
		v0.addNeighbours(new Edge(4,v0,v2));
		v1.addNeighbours(new Edge(1,v1,v2));
		
		DijkstraAlgorithm d = new DijkstraAlgorithm();
		d.computePaths(v0);
		System.out.println(d.getShortestPathTo(v2));
	}

}
