
import java.io.*;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("sum.txt");
			input=new Scanner(in);
			
			int temp,sum=0;
			while (input.hasNext())
			{
				temp=input.nextInt();
			//System.out.print(c);
				for (int i=1;i<=temp;i++)
				{
				System.out.println(i);
				sum=sum+i;
				}
				System.out.println("the total sum is :"+sum);
			}    
			in.exists();
			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}
			}}
