package com.tcp.study;

public class ArrayList<T> {

	private Object[] data;
	private int index = 0;
	private int size = 1; //더 크게? 다른 값?
	//삽입
	//삭제
	//조회
	
	public ArrayList(){
		data = new Object[size];
	}
	
	public void resize(){
		Object[] temp = this.data;
		size*=2;
		this.data = null;
		this.data = new Object[size];
		this.data = temp;
		temp = null;
	}
	
	public void add(Object data){
		if(index ==size){
			resize();
		}
		this.data[index] = data;
	}
	
	//"arraylist는 sortedlist."
	//어떤 의미로?
	
	public void add(Object data, int index){
		
	}
	
	public void delete(int index){
		
	}
	
	public T get(int index){
		T data = (T) this.data[index];
		return data;
	}
	
	//lollllllllllllllllllllllllllll
}
