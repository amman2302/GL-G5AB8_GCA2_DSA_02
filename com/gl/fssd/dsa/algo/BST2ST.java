package com.gl.fssd.dsa.algo;
/*
 * Convert the Binary Search Tree into a Skewed Tree
 */
public class BST2ST {
    /*
     * constructor
     */
    public BST2ST(){

    }//End of constructor
    /*
     * inner class for Node structure
     */
    public static class Node {
        private int iData;
        private Node objLeftNode;
        private Node objRightNode;

        public Node(int iData){
            super();
            this.iData = iData;
        }//End of constructor
        public int getData(){
            return this.iData;
        }//End of getData Method.
        public Node getLeft(){
            return this.objLeftNode;
        }//End of getLeft method

        public Node getRight(){
            return this.objRightNode;
        }//End of getRight method

        public String toString(){
            return this.iData+"";
        }//End of toString method

        public void setiData(int iData){
            this.iData = iData;
        }//End of setiData
        public void setLeftNode(Node objLeft){
            this.objLeftNode = objLeft;
        }//End of setLeftNode
        public void setRightNode(Node objRight){
            this.objRightNode = objRight;
        }//End of setRightNode
    }//End of Node static class
    private Node objNode;
    private Node objPrev = null;
    private Node objHead = null;

    public void setNode(Node objNode){
        this.objNode = objNode;
    }//set Method for Node
    public void setPrevNode(Node objPrev){
        this.objPrev = objPrev;
    }//set Mthod for Prev
    public void setHeadNode(Node objHead){
        this.objHead = objHead;
    }//Set method for Head

    public Node getNode(){
        return this.objNode;
    }//end of getNode
    public Node getPrev(){
        return this.objPrev;
    }//end of getPrev
    public Node getHead(){
        return this.objHead;
    }//end of getHead
    /*
     * Core processing logic to convert BST to ST in a recursive mode
     */
    public void doBST2ST(Node objRoot)
    {
        if(objRoot == null)
            return;
        /*
        *   loop till left leaf node
        */
        doBST2ST(objRoot.objLeftNode);
        Node rightNode = objRoot.objRightNode;
        //Node leftNode = objRoot.objLeftNode;

        if(objHead == null){
            objHead = objRoot;
            objRoot.objLeftNode = null;
            objPrev = objRoot;
        }//End of if block
        else
        {
          /*
          * update the right of predecessor and
          *  also the predecessor to accomodate next node
          */
          objPrev.objRightNode = objRoot;
          objRoot.objLeftNode = null;
          objPrev = objRoot;
        }//End of else block
        doBST2ST(rightNode);
    }//End of processBST
    
    /*
     *  Travese to print the outputs
     */
    public void traverse(Node objRoot)
    {
        /*
        *   traverse till  leaf node for printing in console
        */
        if(objRoot == null)return;
        System.out.println(objRoot.iData);
        traverse(objRoot.objRightNode);
    }//End of traverse
}//End of BST2ST