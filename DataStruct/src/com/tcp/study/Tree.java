package com.tcp.study;

/*
 * Node of Binary Tree
 */
class TreeNode<T extends Object>{
	
	private TreeNode<T> leftNode;
	private TreeNode<T> rightNode;
	
	public TreeNode<T> getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode<T> getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}
}
/*
 * Binary Tree
 */

public class Tree<T extends Object> {

	private T data;
	private TreeNode<T> rootNode;
	
	
	
}
