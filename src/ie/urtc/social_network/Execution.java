package ie.urtc.social_network;

import ie.urtc.social_network.graph.Graph;
import ie.urtc.social_network.graph.GraphPopulation;

public class Execution {

	public static void main(String[] args) {
		
		String file = "SocialNetwork.txt";

		Graph g = GraphPopulation.populateFromFile(file);

		int nodesNumber = g.numberOfNodes();
		System.out.println("Number of Nodes: "+nodesNumber);
		
		
	}

}
