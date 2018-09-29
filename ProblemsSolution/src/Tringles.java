import java.io.*;
import java.util.Scanner;
public class Tringles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("issac.txt");
			input=new Scanner(in);
			
			int num,triangle=1,points;
			num=input.nextInt();
			for(int i=0;i<num&&input.hasNext();i++)
			{
				points=input.nextInt();
			//System.out.print(c);
				triangle=1;
				for(int j=points;j>=(points-2);j--)
				triangle*=j;
				System.out.println(triangle/6);
			}    
			in.exists();
			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}
			
	}

}
