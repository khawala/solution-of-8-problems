import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Planet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("future.txt");
			input=new Scanner(in);
			int num,l;
			int []splited;
			int []stored;
			int []position;
			num=input.nextInt();
			for(int i=0;i<num;i++)
			{l=input.nextInt();
			splited=new int[l];
			for(int j=0;j<l;j++)
				splited[j]=input.nextInt();
			}
			
			in.exists();
			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}

	}

}
