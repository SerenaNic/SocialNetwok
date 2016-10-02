package ie.urtc.social_network.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

	/*Graph implemented as an adjacent list.
	 * Used HashMap and HashSet to reduce 
	 * contains() operation costs. */
	private HashMap<Node,HashSet<Node>> adjList;

	public Graph(){
		adjList = new HashMap<>();
	}

	public int numberOfNodes() {
		return adjList.size();
	}

	public void addUndirectEdge(Node u1, Node u2) {
		addDirectEdge(u1,u2);
		addDirectEdge(u2,u1);	
	}
	
	public void addDirectEdge(Node u1, Node u2) {

		HashSet<Node> neighs;

		if(adjList.containsKey(u1))
			neighs = adjList.get(u1);		
		else
			neighs = new HashSet<>();	

		neighs.add(u2);
		adjList.put(u1, neighs);
		
	}
	/*This method implements a Breath First Search(BFS) to
	 * find the minimum distance between u1 and u2 in an 
	 * unweighted graph. Observe that, for the computation of
	 * single-source shortest paths on unweighted graphs
	 * BFS performs better than Dijkstra. */
	public int getDistance(Node u1, Node u2){

		//Check on inputs
		if(u1.equals(null)||u2.equals(null)) return -1;
		if(!adjList.containsKey(u1)||! adjList.containsKey(u2)) return -1;
		if(adjList.get(u1).contains(u2)) return 1;

		LinkedList<Node> queue = new LinkedList<>();
		
		/*This hashmap is used to keep trace of visited nodes
		and their distance with the source*/
		HashMap<Node,Integer> visited_dist = new HashMap<>();

		queue.add(u1);
		visited_dist.put(u1,0);

		while(!queue.isEmpty()){

			Node n = queue.poll();
			if(adjList.get(n).contains(u2)) 
				return visited_dist.get(n)+1;
			for(Node nn:adjList.get(n)){
				if(!visited_dist.containsKey(nn)){
					visited_dist.put(nn,visited_dist.get(n)+1);
					queue.add(nn);
				}
			}
		}
		//No path is found
		return -1;
	}
}
