package object;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kang");
		boolean flag3 = set1.add("kim");
		
		System.out.println(set1.size());
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> it = set1.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		for(String str : set1){
			System.out.println(str);
		}
		
	}
}
