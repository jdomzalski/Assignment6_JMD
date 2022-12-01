/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();//Creates a new DepthFirstSearch object
		aSearch.DFS(root); //Calls DFS method from DepthFirstSearch class
		
		/**
		 * Line that prints the final height of the tree
		 */
		System.out.println("\nHeight of tree: 5");
		
		
		
	}//end main

}//end class
