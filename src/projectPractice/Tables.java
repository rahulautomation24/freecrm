package projectPractice;

public class Tables {
	
	private static  final int tableUpto=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing tables of 1 to "+tableUpto);
		
		for (int i=0;i<tableUpto;i++){
			
			System.out.println("TABLE OF "+" "+(i+1)+" "+ "is" );
			System.out.println("-------------------------------------");
			
			for( int j=0;j<10;j++){
				
				System.out.println((i+1)+" * "+(j+1)+" = "+ (i+1)*(j+1));
				
			}
		}

	}

}
