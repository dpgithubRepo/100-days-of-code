package day2;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class DFS_CycleDetection_UndirectedGraph.
 */
public class DFS_CycleDetection_UndirectedGraph {
	
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
	 * Dfs recursive.
	 *
	 * @param adjList the adj list
	 * @param src the src
	 * @param visited the visited
	 * @param parent the parent
	 * @return true, if successful
	 */
	public static boolean dfsRecursive(List<ArrayList<Integer>> adjList, int src, boolean[] visited, int parent) {
		visited[src] = true;
		for(int i : adjList.get(src)) {
			if(!visited[i]) {
				if(dfsRecursive(adjList, i, visited, src)) {
					return true;
				}
			}else if (i!=parent) {
				return true;
			}
			
		}
		
		
		return false;
	}
	
	/**
	 * Detect cycle by DFS.
	 *
	 * @param adjList the adj list
	 * @param src the src
	 * @param nodes the nodes
	 * @param parent the parent
	 * @return true, if successful
	 */
	public static boolean detectCycleByDFS(List<ArrayList<Integer>> adjList, int src, int nodes, int parent) {
       boolean visited[]= new boolean[nodes];
       return dfsRecursive(adjList, src, visited, -1);
       
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
		
		
		/**
		 * Class to represent the given graph using the adjacent list :: Cycle is present
		 * 
		 *  Nodes 0,1,2,3
		 *  
		 *        0 ---- 1 ------3
		 *         \     /
		 *          \   /
		 *            2
		 * 
		 */
		
		//soruce node 0
		System.out.println(detectCycleByDFS(adjList, 0, 5,-1));
		
		
		
		/**
		 * Class to represent the given graph using the adjacent list :: cycle not present
		 * 
		 *  Nodes 0,1,2,3
		 *  
		 *        0 ---- 1 ------3
		 *               /
		 *              /
		 *            2
		 * 
		 */
		
		 adjList = new ArrayList<ArrayList<Integer>>(capacity);
		for(int i=0;i<capacity;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		addEdge(adjList,0,1);
		addEdge(adjList,1,2);
		addEdge(adjList,1,3);
		System.out.println(detectCycleByDFS(adjList, 0, 5,-1));
		
		
		
		/**
		 * Class to represent the given graph using the adjacent list :: cycle  present
		 * 
		 *  Nodes 0,1,2,3
		 *  
		 *        0 ---- 1 ------3
		 *               |       /
		 *               |      /
		 *               |     / 
		 *               |    /
		 *               |   /
		 *               2 
		 *
		 */
		
		 adjList = new ArrayList<ArrayList<Integer>>(capacity);
			for(int i=0;i<capacity;i++) {
				adjList.add(new ArrayList<Integer>());
			}
			
			addEdge(adjList,0,1);
			addEdge(adjList,1,2);
			addEdge(adjList,1,3);
			addEdge(adjList,3,2);
			System.out.println(detectCycleByDFS(adjList, 0, 5,-1));
		
	}

}



