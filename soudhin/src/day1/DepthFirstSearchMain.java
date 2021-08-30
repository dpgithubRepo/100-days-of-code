package day1;


/**
 *  For the below graph where A,B,C,D,E,F are nodes and have edges as shown. 
 *  
 *                      *A     
 *                      /  \
 *                     /    \
 *                    *C     \
 *                    /       *B
 *                   /         \
 *                  *E          \
 *                 /             *D
 *                /
 *              *F    
 *
 *  There are two paths shown possible with starting Node as A 
 *  1. ABD  2. ACEF
 *  
 *  with starting Node as B
 *  1. BD, BACEF
 *  
 *  similarly with Starting Node as D only one path possible
 *  1. DBACEF
 *  
 *  
 *  similarly with F as staring node only one path is possible
 *  FECAD
 *  
 *  Given the node print the output paths 
 *
 */
public class DepthFirstSearchMain {

	public static void main(String[] args) {
  
		Graph graph = new Graph(6);
		graph.addVertex('A');         //0
		graph.addVertex('B');        //1
		graph.addVertex('C');       //2
		graph.addVertex('D');      //3
		graph.addVertex('E');     //4
		graph.addVertex('F');    //5
		
		graph.addEdge(0, 1);     //AB
		graph.addEdge(0, 2);    //AC
		graph.addEdge(2, 4);   //CE
		graph.addEdge(1, 3);  //BD
		graph.addEdge(4, 5); //EF
		
		
		
		System.out.print("F as start node");
		graph.dfs1(5);   // with F as input node  o/p-> FECABD
		System.out.println("\n\n");
		
		System.out.print("A as start node");
		graph.dfs1(0);   //with A as input node  o/p-> 1.ABD 2.ACEF
		System.out.println("\n\n");
		
		
		System.out.print("B as start node");
		graph.dfs1(1);     //with B as input node   o/p-> 1. BACEF 2. BD
		
	}
}
