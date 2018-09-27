package object;

public class Student {
	
	String name;
	String number;
	int birthyear;

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthyear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthyear != other.birthyear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthyear=" + birthyear + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.number = "1234";
		s1.birthyear = 1234;
		
		Student s2 = new Student();
		s2.name = "ȫ�浿";
		s2.number = "1234";
		s2.birthyear = 1234;
		
		if( s1.equals(s2)){
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");
		}
		
		String a = "����";
		String b = "����";
		String c = new String("����");
		String d = new String("����");
		
		if(a.equals(d))
		System.out.println("����");
		else
		System.out.println("�ٸ���");
	
		if(a == c)
			System.out.println("����");
			else
			System.out.println("�ٸ���");
	
		
		
	System.out.println(s1);
		
	}
}
