import java.io.*;
public class StringRev
{	public static void main(String args[]) throws Exception
	{	char c;
		String str=new String();					
		try
		{ 
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any String ");
		str=rd.readLine();
			 
		}catch (IOException e)
		{	e.printStackTrace();
		}	
		int l=str.length();
		char []ch=new char[l];		
		for (int j=0,i=l-1;i>=0;i--,j++)
		{
			c=str.charAt(i);
			ch[j]=c;
			
		}
		str=String.valueOf(ch);	
		System.out.println("Reverse of String is "+str);
	

	}
}

