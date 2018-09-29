import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Pool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("pool.txt");
			input=new Scanner(in);
			
			int num,volume;
			num=input.nextInt();
			for(int i=0;i<num;i++)
			{volume=input.nextInt();
				for(int j=1;j<=(volume/3);j++)
					if((j*j*j)==volume)
						volume=j;
				
				System.out.println("the required length is:"+volume*12);
			}
			in.exists();
			}
		catch (IOException e){System.out.print("can not find the file");}
	}

}
