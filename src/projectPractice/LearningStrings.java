package projectPractice;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningStrings {

	public static void main(String[] args) {
		
		System.out.println(calcper(5, 20)+"%");
		// TODO Auto-generated method stub
		int val = 0;
		
		System.out.println("Before Writing");
		
		writeFile("I am writing in the file /n");
		System.out.println("After writing");
		try{ val =9/0;
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception");
		}
		System.out.println("Procedding with the flow");
		System.out.println("Value is "+ val);
		boolean chkeven=isEven();
		System.out.println(chkeven);
		
		/*int fact= calcFactorial(5);
		System.out.println(fact);*/
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    int n = in.nextInt(); 

		/*String s="Automation in Selenium";
		char[] arr=s.toCharArray();

	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Jars\\mozilladriver\\geckodriver.exe");
	WebDriver dri = new FirefoxDriver();
	dri.navigate().to(getproperty("url"));
	dri.findElement(By.xpath("//input[@name='uid']")).sendKeys(getproperty("username"));
	dri.findElement(By.xpath("//input[@name='password']")).sendKeys(getproperty("password"));
	dri.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	
	
	
	
*/	}
	public static String  getproperty(String prop){
		FileInputStream input = null;
		Properties pr;
		
		 pr= new Properties();
		
		try {
			 input =new FileInputStream("D:\\Automation\\Workspace\\projectPractice\\propfile.properties");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			try {
				pr.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return  pr.getProperty(prop);
		
	}
	
	public static void  writeFile(String Content){
		FileWriter fw = null;
		BufferedWriter bw= null;
		
		try {
			fw= new FileWriter("D:\\Automation\\Workspace\\projectPractice\\fileWriting.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bw= new BufferedWriter(fw);
		
		try {
			bw.write(Content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.flush();
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static boolean isEven(){
		boolean isEven=false;
		int n=1;
		
		if(n%2==0){
			isEven=true;
			System.out.println("Number "+ n +" is Even");
			 
		}
		else{
		System.out.println("Number "+ n +" is Odd");
		isEven=false;}
		
		return isEven;
	}



public static int calcFactorial(int n){
	int fact=1;
		while(!(n==1)){
		fact=n*(n-1);
		
	}
	
	return fact;
	
	
} 
public static double calcper(double number, double  base){
	
	return (number/base)*100;
}

}