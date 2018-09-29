import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Future {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("future.txt");
			input=new Scanner(in);
			int num,temp1=0,temp2=0,l;
			num=input.nextInt();
			for(int i=0;i<num;i++)
			{l=input.nextInt();
			for(int j=0;j<l*2;j++)
				{if(j<5)	
				temp1+=input.nextInt();
				else
				temp2+=input.nextInt();	
			}System.out.println(temp2-temp1);}
			in.exists();
			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}

	}

}
