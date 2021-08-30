package day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to represent the given graph using the adjacent list
 * 
 *  Nodes 0,1,2,3
 *  
 *        0 ---- 1 ------3
 *         \     /
 *          \   /
 *            2
 * 
 * Adjacency List
 *  1->2
 *  0->2->3
 *  0->1
 *  1.
 */
public class GraphAdjacentList_DFSRecursive {
	
	/**
	 * Adds the edge.
	 *
	 * @param adjList the adj list
	 * @param u the u
	 * @param v the v
	 */
	public static void addEdge(List<ArrayList<Integer>> adjList, int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	/**
	 * Prints the graph.
	 *
	 * @param adjList the adj list
	 */
	public static void printGraph(List<ArrayList<Integer>> adjList) {
		for(int i=0;i<adjList.size();i++) {
			 for(int j=0;j<adjList.get(i).size();j++) {
				 System.out.print(adjList.get(i).get(j));
			 }
			 System.out.println();
		}
	}
	
	
	/**
	 * Dfs recursive.
	 *
	 * @param adjList the adj list
	 * @param visited the visited
	 * @param startNode the start node
	 */
	public static void dfsRecursive(List<ArrayList<Integer>> adjList, Boolean[] visited, int startNode) {
		visited[startNode] = true;
		System.out.print(startNode + " ");
		for(int u: adjList.get(startNode)) {
			if(!visited[u]) dfsRecursive(adjList, visited, u);
		}
		
	}
	
	/**
	 * Dfs.
	 *
	 * @param adjList the adj list
	 * @param startNode the start node
	 * @param nodes the nodes
	 */
	public static void dfs(List<ArrayList<Integer>> adjList, int startNode, int nodes) {
		 Boolean[] visited = new Boolean[nodes];
		 for(int i=0;i<nodes;i++) visited[i]= false;
		 dfsRecursive(adjList, visited, startNode);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int capacity = 5; //no of nodes
		List<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(capacity);
		
		for(int i=0;i<capacity;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		addEdge(adjList,0,1);
		addEdge(adjList,0,2);
		addEdge(adjList,1,2);
		addEdge(adjList,1,3);
		
		printGraph(adjList);
		
		//source/start node 0
		dfs(adjList, 0, 5);
		
		System.out.println();
		
		//source/start node 3
		dfs(adjList, 3, 5);
		
		System.out.println();
		//source/start node 2
		dfs(adjList, 2, 5);
	}

}
