class Node  
{ 
    int data; 
    Node left, right; 
       
    Node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 
   
public class height
{ 
    Node root; 
   

   
    void LevelOrder(Node node)  
    { 
        int h = height(node);
       System.out.println("height : "+h);		
       
    } 
   
  
  
   
   
    int height(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            
            int lheight = height(node.left); 
            int rheight = height(node.right); 
   
          
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
   
    public static void main(String args[])  
    { 
        height tree = new height(); 
   
      
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
		 

              tree.LevelOrder(tree.root);		 
       
        
        
    } 
} 
   