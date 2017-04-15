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
		this.data[index++] = data;
	}
	
	//"arraylist는 sortedlist."
	//어떤 의미로?
	
	public void add(Object data, int index){
		if(index>this.index){
			//error syntax
			return;
		}
		
		
	}
	
	public void delete(int index){
		if(index>=this.index){
			//error syntax
			return;
		}
		else{
			data[index] = null;
			for(int i=index; i<this.index-1;i++){
				data[index] = data[index+1];
			}
			data[--this.index] = null;
		}
		
	}
	
	public T get(int index){
		return (T)this.data[index];
	}
	
	//lollllllllllllllllllllllllllll
}
