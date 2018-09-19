package CycleDetection;

public class CycleDetection {
	public void dfs(Vertex vertex) {
		vertex.setVisited(false);
		vertex.setVisiting(true);
		for(Vertex v:vertex.getNeighbourList()) {
			if(v.isVisiting()) {
				System.out.println("There is a loop on " + vertex.getData() + " and "+ v.getData());
				return;
			}
			if(!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}
		}
		vertex.setVisited(true);
		vertex.setVisiting(false);
	}
}
