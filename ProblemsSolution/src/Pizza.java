import java.io.*;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("pizza.txt");
			input=new Scanner(in);
			
			int num,temp;
			double area;
			num=input.nextInt();
			for(int i=0;i<num;i++)
			{temp=input.nextInt();
				area=temp*2.418399;
				System.out.println(area);
			}
			
			in.exists();
			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}
	}

}
