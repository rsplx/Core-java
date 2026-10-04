package in.co.rays.string;

public class NAMERECONISATION2 {
	public static void main (String[] args) {
		String name = "INFOSIS";
		
		int count = 0;
		{
			for(int i = 0;i<name.length();i++) {
				if(name.charAt(i)=='S')
					count++;
				
				
			}
			System.out.println( "Number of s"+count);
			
		}
	}

}
