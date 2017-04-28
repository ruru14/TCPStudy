package com.tcp.study;

public class Queue<T extends Object> {
	private Node<T> front;
	private Node<T> rear;
	
	public Queue(){
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty(){
		return (rear==null);
	}
	
	public void put(T data){
		Node<T> temp = new Node<T>();
		temp.setData(data);
		
		if(isEmpty()){
			front = temp;
			rear = temp;
		}
		else{
			rear.setNextNode(temp);
			rear = temp;
		}
	}
	
	public T peek(){
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		return front.getData();
	}
	
	public T get(){
		T item = peek();
		front = front.getNextNode();
		
		if(front == null)
			rear = null;
		
		return item;
	}
	
	public static void main(String[] args) {
		Queue<Integer> test = new Queue();
		
		test.put(1);
		test.put(3);
		test.put(2);
		
		System.out.println(test.get());
		System.out.println(test.get());
		System.out.println(test.get());
	}
}
