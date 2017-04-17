package com.tcp.study;

class Node<T extends Object> {

	private T data;
	private Node<T> nextNode;

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> nextNode() {
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

public class LinkedList<T extends Object> {

	private Node<T> headNode;
	private Node<T> node;
	private int index = 0;

	public LinkedList() {
		headNode = new Node<T>();
		node = headNode;
	}

	//맨 뒤에 삽입
	public void add(T data) {
		node.setData(data);
		node = node.nextNode();
		index++;
	}

	//중간에 삽입
	public void add(T data, int index) {
		try{
			if(index>this.index)
				throw new IndexOutOfBoundsException();
			if(index==this.index)
				add(data);
			else{
				Node<T> tempNode = headNode;
				Node<T> newNode = new Node<T>();
				newNode.setData(data);
				for(int i=0; i<index-1;i++){
					tempNode = tempNode.nextNode();
				}
				newNode.setNextNode(tempNode.getNextNode());
				tempNode.setNextNode(newNode);
				index++;
			}
		}catch(IndexOutOfBoundsException e){
			e.getMessage();
		}
	}

	public void delete(int index) {
		try {
			if(index<0||index>this.index)
				throw new IndexOutOfBoundsException();
			if (index == 0) {
				Node<T> tempNode = headNode;
				headNode = headNode.getNextNode();
				tempNode = null;
				index--;
			} else {
				Node<T> tempNode = headNode;
				for (int i = 1; i < index; i++)
					tempNode.getNextNode();
				tempNode.setNextNode(tempNode.getNextNode().getNextNode()); 
				// 꼭
				// 이래야되나
				// 다른방법없나
				Node<T> deleteNode = tempNode.getNextNode();
				deleteNode = null;
				index--;
			}
		} catch (IndexOutOfBoundsException e) {
			e.getMessage();
		}
	}

	public T get(int index) {
		try{
			Node<T> tempNode = headNode;
			for (int i = 0; i < index; i++)
				tempNode.getNextNode();
			return tempNode.getData();

		}catch(Exception e){
			return null;
		}
	}

}
