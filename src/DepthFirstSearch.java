/**
 * A class to represent our depth first search
 */

public class DepthFirstSearch{       
       Node root;
       /*
        * Creating an x variable that will be used to keep count of how many nodes have been traversed
        * Initializing variable at 1
        */
       int x = 1;
       
       
       public DepthFirstSearch()
       {               
                   System.out.println(" \nCall DFS with root node to do a Depth First Search.");
       }
       /**
        * A method that traverses a tree using a depth first search
        * @param Node node
        */
        public void DFS(Node node)        {
        	
        	
        	/**
        	 * Two lines that will be printed every time the method is called.
        	 * x variable incremented by 1 for each method call.
        	 */
                   System.out.println("Value of node: "+node.getData()); 
                   System.out.println("Number of nodes traversed: "+x);
                   x++;
                   

                 
                  //ADD CODE TO TRAVERSE THE TREE HERE
                   /**
                    * If statement that checks to see if the left child of a node is null. 
                    * If the left node is null, a recursive call is made on the left child
                    * After the recursive calls on the left nodes, a recursive call on the right nodes is executed
                    */
                   if(node.getlChild() != null) {
                	   DFS(node.getlChild());
                	   DFS(node.getrChild());
                   }
                   /**
                    * Conditional check to see if a node is a leaf 
                    */
                   else if (node.getlChild() == null && node.getrChild() == null) {
                	   System.out.println("This node is a leaf");
                   }
                   
                  
         
                 
                           
                  //THIS IS APPROXIMATELY THREE LINES OF CODE
                  //INCLUDING AN IF STATEMENT TO
                  //SEE IF THE NODE IS A LEAF
                  //AND TWO RECURSIVE CALLS TO THE CHILDREN

                  //MODIFY OTHER CODE AS NECESSARY

        }

}