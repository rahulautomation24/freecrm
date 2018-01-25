import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> hm =new HashMap<String,String>();
		Map<String,String> hm1 =new HashMap<String,String>();
		hm.put("Rahul", "AnalyticsQuotient");
		hm.put("Prateek", "Accenture");
		hm.put("Miraj", "Oracle");
		
		System.out.println(hm.get("Rahul"));
		System.out.println(hm.size());
		hm1.put("kabira", "AnalyticsQuotient");
		hm1.put("swadha", "Accenture");
		hm1.put("chotu", "Oracle");
		hm.putAll(hm1);
		System.out.println(hm.size());
		
		
		for( Entry <String,String>m:hm.entrySet()){
			System.out.println(m.getKey() +"-"+ m.getValue());
		}
		
		
		/*
		 * Finding duplicate word 3 approaches
		 */
		
		String[] str={"java","Php","Cobol","Python","Ruby","java","Cobol"};
		
		/*
		 * 1st approach
		 */
		
		for (int i=0;i<str.length;i++){
			
		 for (int j=i+1;j<str.length;j++){
			 if(str[j].equals(str[i]))
		 
		 System.out.println("Duplicate value is "+str[i]);
		   }		
		 
	   }
		
		/*
		 * 2nd Approach
		 */
		
		Set<String> hset=new HashSet<String>();
		for(String indstr:str){
			if(hset.add(indstr)==false)
				System.out.println("Duplicate string is "+indstr);
		}
		
  }
		
}


