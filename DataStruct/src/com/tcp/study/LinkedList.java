package com.tcp.study;

class Node<T>{
	
	private T data;
	private Node<T> nextNode;
	
	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node nextNode(){
		nextNode = new Node();
		return nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class LinkedList<T> {

	private Node<T> headNode;
	private Node<T> node;
	private int index = 0;
	
	public LinkedList(){
		headNode = new Node<T>();
		node = headNode;
	}
	
	public void add(T data){
		node.setData(data);
		node = node.nextNode();
		index++;
	}
	
	public void add(T data, int index){
		if(index > this.index){
			
		}
	}
	
	public void delete(int index){
		if(index >= this.index){
			//error syntax
		}
		if(index == 0){
			Node<T> tempNode = headNode;
			headNode = headNode.getNextNode();
			tempNode = null;
			index--;
		}
		else{
			Node<T> tempNode = headNode;
			for(int i=1; i<index;i++)
				tempNode.getNextNode();
			tempNode.setNextNode(tempNode.getNextNode().getNextNode()); //꼭 이래야되나 다른방법없나
			Node<T> deleteNode = tempNode.getNextNode();
			deleteNode = null;
			index--;
		}
	}
	
	public T get(int index){
		if(index >=this.index){
			//error syntax
		}
		else{
			Node<T> tempNode = headNode;
			for(int i=0;i<index;i++)
				tempNode.getNextNode();
			return tempNode.getData();
		}
		return null;
	}
	
}
