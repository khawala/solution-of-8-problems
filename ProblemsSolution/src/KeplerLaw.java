import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KeplerLaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		
		try {
			in= new File("kepler.txt");
			input=new Scanner(in);
			
			int num,count;
			String nickname,name,temp;
			boolean b=true;
			num=input.nextInt();
			for(int i=0;i<num;i++)
			{
			name=input.next();
			nickname=input.next();
			System.out.println(name+"\n"+nickname);
			if(nickname.length()<name.length())
			{temp=nickname;
			nickname=name;
			name=temp;}
			b=true;
			count=0;
			for(int j=0;j<name.length()&&b==true;j++)
			{b=false;
				for(int k=count;k<nickname.length();k++)
				if(name.charAt(j)==nickname.charAt(k))
					{b=true;
					count=k+1;
					break;}
				}
			if(b==true)
				System.out.println("YES");
			else
				System.out.println("NO");}
			in.exists();}
		catch (IOException e)
		{System.out.print("can not find the file");}
	}}
