package object;

public class BoxExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("hello");
		System.out.println(box.getObj());
		
		box.setObj("string");
		String str = (String)box.getObj();
		System.out.println(str);
		
		box.setObj(1);
		int value = (int)box.getObj();
		System.out.println(value);
		
		
/*		Box<Object> box1 = new Box<>();
		box1.setObj(new Object());
		Object obs = box1.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		System.out.println(box2.getObj());
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(1);
		int v2 = box3.getObj();
		System.out.println(v2);*/
		
	}
}
