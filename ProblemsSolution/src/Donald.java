import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Donald {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		try {
			in= new File("donald.txt");
			input=new Scanner(in);
			
			int num,songN;
			int []songKey;
			num=input.nextInt();
			songN=input.nextInt();
			songKey=new int[songN];
			System.out.println("Number of the song that you want to find the platylist of them are: "+songN);
			for(int i=0;i<num;i++)
			{for(int j=0;j<songN;j++)
				songKey[j]=input.nextInt();
				Arrays.sort(songKey);
				for(int k:songKey )
				{if(k%2!=0)
				System.out.print(k+" ");} 
				
				for(int k:songKey )
				{if(k%2==0)
				System.out.print(" "+k);} 
			}
			in.exists();
			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}
			
	}

}
