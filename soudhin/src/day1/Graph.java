package day1;

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
 * The Class Graph contains methods for creating the vertex list, 
 * adjacency matrix, adding vertices and edge.
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
	 * @param end the end
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
		System.out.println(vertex_list[v].getLabel());
	}
	
}
