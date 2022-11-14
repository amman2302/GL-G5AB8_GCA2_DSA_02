package com.gl.fssd.dsa.main;

import com.gl.fssd.dsa.algo.BST2ST;
import com.gl.fssd.dsa.algo.BST2ST.Node;

public class DriverClass {
    public static void main(String[] strArg)
    {
         try{
            BST2ST oBST2ST = new BST2ST();
            oBST2ST.setNode(new Node(50));
            oBST2ST.getNode().setLeftNode(new Node(30));
            oBST2ST.getNode().setRightNode(new Node(60)); 
            oBST2ST.getNode().getLeft().setLeftNode(new Node(10));
            oBST2ST.getNode().getRight().setLeftNode(new Node(55));
            //oBST2ST.getNode().getLeft().getLeft().setLeftNode(new Node(5));
            //oBST2ST.getNode().getRight().getLeft().setLeftNode(new Node(40));
            
            oBST2ST.doBST2ST(oBST2ST.getNode());
            oBST2ST.traverse(oBST2ST.getHead());
           
        }catch(Exception oException){
            System.out.println("Exception occured "+oException.getMessage());
        }//End of try-catch block  
    }//End of main method
}//End of DriverClass