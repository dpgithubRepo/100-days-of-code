package day1;

import java.util.Arrays;
import java.util.Stack;

/**
 * This class represents a vertex in the graph.  
 */
class Vertex {
	private char label;
	private boolean isVisited;

	/**
	 * Instantiates a new vertex.
	 *
	 * @param label the label
	 */
	public Vertex(char label) {
		this.label = label;
		this.isVisited = false;
	}

	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public char getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 *
	 * @param label the new label
	 */
	public void setLabel(char label) {
		this.label = label;
	}

	/**
	 * Checks if is visited.
	 *
	 * @return true, if is visited
	 */
	public boolean isVisited() {
		return isVisited;
	}

	/**
	 * Sets the visited.
	 *
	 * @param isVisited the new visited
	 */
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

}

/**
 * The Class Graph contains methods for creating the vertex list, adjacency
 * matrix, adding vertices and edge.
 * 
 * This class uses adjancent matrix and iterative approach for DFS
 */
public class Graph {

	/** The max verts. */
	private int max_verts;

	/** The vertex list. */
	private Vertex[] vertex_list;

	/** The adj matrix. */
	private int[][] adj_matrix;

	/** The n verts. */
	private int nVerts;

	/** The stack. */
	private Stack<Integer> stack = new Stack<>();

	/**
	 * Instantiates a new graph.
	 *
	 * @param max_verts the max verts
	 */
	public Graph(int max_verts) {
		this.max_verts = max_verts;
		vertex_list = new Vertex[max_verts];
		adj_matrix = new int[max_verts][max_verts];
		nVerts = 0;
	}

	/**
	 * Adds the vertex.
	 *
	 * @param label the label
	 */
	public void addVertex(char label) {
		vertex_list[nVerts++] = new Vertex(label);
	}

	/**
	 * Adds the edge.
	 *
	 * @param start the start
	 * @param end   the end
	 */
	public void addEdge(int start, int end) {
		adj_matrix[start][end] = 1;
		adj_matrix[end][start] = 1;
	}

	/**
	 * Display vertex.
	 *
	 * @param v the v
	 */
	public void displayVertex(int v) {
		System.out.print(vertex_list[v].getLabel());
	}

	/**
	 * Gets the adj unvisited vertex.
	 *
	 * @param v the v
	 * @return the adj unvisited vertex
	 */
	public int getAdjUnvisitedVertex(int v) {
		for (int i = 0; i < nVerts; i++) {
			if (adj_matrix[v][i] == 1 && !vertex_list[i].isVisited()) {
				return i;
			}
		}

		return -1;
	}

	
	public void dfs1(int i) {
		stack.push(i);
	//	displayVertex(0);
		vertex_list[i].setVisited(true);
		while (!stack.isEmpty()) {
			int peek = stack.peek();
			int adj = getAdjUnvisitedVertex(peek);
			if (adj == -1) {
				stack.pop();
			} else {
				if(peek==i) {
					System.out.println();
					displayVertex(i);
				}
				stack.push(adj);
				displayVertex(adj);
				vertex_list[adj].setVisited(true);
			}

		}
		
		cleanUp();
	}
	
	
	private void cleanUp() {
		Arrays.asList(vertex_list).forEach(v->v.setVisited(false));
	}
		
	/**
	 * Dfs.  Depth First Search.
	 * Step 1: If possible, visit an adjacent unvisited vertex, mark it, and push it on the stack
	 * Step 2: If you can’t follow Rule 1, then, if possible, pop a vertex off the stack.
	 * Step 3: if you can't follow step 1 or step 2, you are done
	 * 
	 */
		public void dfs() {
			stack.push(0);
			displayVertex(0);
			vertex_list[0].setVisited(true);
			while (!stack.isEmpty()) {
				int adj = getAdjUnvisitedVertex(stack.peek());
				if (adj == -1) {
					stack.pop();
				} else {
					stack.push(adj);
					displayVertex(adj);
					vertex_list[adj].setVisited(true);
				}

			}
	}
}
