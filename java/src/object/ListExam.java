package object;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	
	  public List<Object> addArray(String[]arr1, String[]arr2){
		    List<Object> list = new ArrayList<Object>();
		    
		    list.add(arr1);
		    list.add(arr2);
			
		     
		    
/*		    for(String str : arr1){
		      list.add(str);
		      System.out.println(str);     
		    }

		    for(String str : arr2){
		      list.add(str);
		      System.out.println(str);
		    }*/
			

		    return list;
		  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String[] array1 = {"근형","근형","근형"};
		String[] array2 = {"1","2","3"};
		
		ListExam le = new ListExam();
		
		System.out.println(le.addArray(array1, array2));
		
		Object k = le.addArray(array1, array2);
		
		System.out.println(k.getClass());
		System.out.println(k.toString());
		
		
	/*	List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		
		for(String str : list ){
			System.out.println(str);
		}
		
		for(int i=0; i < list.size(); i++ ){
			
			String b = "";
			System.out.println(b = list.get(i));
		}*/
		
		
		
	}

}
