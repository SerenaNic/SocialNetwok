package ie.urtc.social_network;

import ie.urtc.social_network.graph.Graph;
import ie.urtc.social_network.graph.GraphPopulation;
import ie.urtc.social_network.graph.Node;

public class Execution {

	public static void main(String[] args) {

		String file = "SocialNetwork.txt";

		Graph g = GraphPopulation.populateFromFile(file);

		/* Determine the total number of people in the social network.*/
		int nodesNumber = g.numberOfNodes();
		System.out.println("Number of Nodes: "+nodesNumber);

		Node a = new Node("STACEY_STRIMPLE");
		Node b = new Node("RICH_OMLI");
		
		/*Determine the distance between A and B. 
		 * Return -1 if a path does not exist*/
		int d = g.getDistance(a,b);

		System.out.println("Distance between "+ a.toString() +" and "+b.toString()+": "+d);

	}

}
