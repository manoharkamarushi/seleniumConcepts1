package DP_hashMap;
import java.util.HashMap;
import java.util.Map;


public class HashMapex {

	public static void main(String[] args) {
	     
	       
	      HashMap<Integer,String> hm=new HashMap<Integer,String>();  
//	      keys should be unique
	      hm.put(99,"Amit");  
	      hm.put(99,"Vijay");  
	      hm.put(104,"Rahul");  
	      
	      for(Map.Entry m:hm.entrySet()){  
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }  
	     
	}  
	     
}


