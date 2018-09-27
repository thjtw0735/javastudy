package object;

public class StringBufferExam {

	public StringBufferExam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();
		sb3 = sb2.append("hello");
		if(sb2 == sb3){
			System.out.println("sb2==sb3");
		}
		
		
		
	}

}
