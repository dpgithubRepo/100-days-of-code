package day1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class DFSRecursive. (Depth First Search)
 */
public class DFSRecursive {
	
	/**
	 * Adds the edge.
	 *
	 * @param adjList the adj list
	 * @param start the start
	 * @param end the end
	 */
	public static void addEdge(List<ArrayList<Integer>> adjList, int start, int end) {
		adjList.get(start).add(end);
		adjList.get(end).add(start);
	}

	/**
	 * Dfs.
	 *
	 * @param adjList the adj list
	 * @param source the source
	 * @param nodes the nodes
	 */
	public static void dfs(List<ArrayList<Integer>> adjList, int source, int nodes) {
		boolean[] visited = new boolean[nodes];
	    dfsRec(adjList, source, visited);
	}
	
	/**
	 * Dfs rec.
	 *
	 * @param adjList the adj list
	 * @param source the source
	 * @param visited the visited
	 */
	public static  void dfsRec(List<ArrayList<Integer>> adjList, int source, boolean[] visited) {
		visited[source] = true;
		System.out.print(source+" ");
		for(int u: adjList.get(source)) {
	    	if(!visited[u]) {
	    		dfsRec(adjList, u, visited);
	    	}
	    }
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(5);
		int nodes = 5;
		for(int i=0;i<nodes;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		addEdge(adjList,0,1);
		addEdge(adjList,0,2);
		addEdge(adjList,1,2);
		addEdge(adjList,1,3);
		
        dfs(adjList, 0, 5);
		
		System.out.println();
		
		//source/start node 3
		dfs(adjList, 3, 5);
		
		System.out.println();
		//source/start node 2
		dfs(adjList, 2, 5);
		
	}
	
}
