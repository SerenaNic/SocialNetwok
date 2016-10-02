package ie.urtc.social_network.graph;

import java.util.HashMap;
import java.util.HashSet;

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
		// TODO Auto-generated method stub
		
	}

}
