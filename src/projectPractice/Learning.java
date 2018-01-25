package projectPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Learning Automation");
		
		List<String> al = new ArrayList<String>();
         al.add("Rahul");
         al.add("Swadha");
         al.add("Mummy");
         al.add("Papa");
         al.add("Bhaiya");
         al.add("Chotu");
         al.add("Ankit");
         System.out.println(al.get(0));
         System.out.println(al.size());
         
         String inputdata="I am the don of Automation";
        String[] arr= inputdata.split(" ");
        for(int i=0;i<arr.length;i++){
        	String splitString=arr[i];
        	
        	
        	for(int j=splitString.length()-1;j>=0;j--){
        		System.out.print(splitString.charAt(j));
        		
        	}
        	System.out.print(" ");
        	
        }
        
        
         
        		 
         
	}
	
	

}
