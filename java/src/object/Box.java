package object;
/*
public class Box {
	private Object obj;

	public void setObj( Object obj){
		this.obj = obj;
	}
	
	public Object getObj(){
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/


public class Box<E>{
	private E obj;

	public void setObj( E obj){
		this.obj = obj;
	}
	
	public E getObj(){
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}