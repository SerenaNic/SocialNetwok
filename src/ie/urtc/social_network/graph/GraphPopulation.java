package ie.urtc.social_network.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphPopulation {

	public static Graph populateFromFile(String fileS) {
		
		Graph g = new Graph();
		File file = new File(fileS);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				Node u1 = new Node(line[0]);
				Node u2 = new Node(line[1]);
				
				/*Added two direct edges to the graph*/
				g.addUndirectEdge(u1,u2);

			}				
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return g;
	}
}