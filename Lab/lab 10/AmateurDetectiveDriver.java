import java.io.*;

class CustomException extends Exception  
{  
    public CustomException(String str)  
    {  
        super(str);  
    }  
}  

class AmateurDetective
{
	String message;
	String decryptMessage[];
	
	AmateurDetective(String message)
	{
		this.message = message;
	}

	void encryption(int rails)
	{
		decryptMessage = new String[rails];
		int current = 0;
		int f = 0;
		for(int i = 0;i<rails;i++)
			decryptMessage[i] = "";
		for(int i = 0;i<message.length();i++)
		{
			if(message.charAt(i) == ' ')
				continue;
			for(int j = 0;j<rails;j++)
				if(j == current)
					decryptMessage[j] += ""+message.charAt(i);
				else
					decryptMessage[j] += ".";	
			if(f == 0)
				current++;
			else
				current--;
			if(current == rails)
			{
				f = 1;
				current = rails - 2;
			}
			else if(current == -1)
			{
				f = 0;
				current = 1;
			}	
		}	
		System.out.println("\n\nENCRYPTED MESSAGE: ");
		for(int i = 0;i<rails;i++)
		{
			for(int j = 0;j<decryptMessage[i].length();j++)
				System.out.print(decryptMessage[i].charAt(j)+" ");	
			System.out.println();
		}
	}

	void decryption()
	{
		int c = 0;
		int f = 0;
		int y = 0;
		String res = "";
		while(f != decryptMessage[0].length())
		{
			res = res + decryptMessage[c].charAt(f);
			f++;
			if(y == 0)
				c++;
			else
				c--;
			if(c == decryptMessage.length)
			{
				y = 1;
				c = decryptMessage.length - 2;
			}		
			else if(c == -1)
			{
				y = 0;
				c = 1;
			}
		}
		System.out.println("\n\nDECRYPTED MESSAGE: "+res);
	}
}

class AmateurDetectiveDriver
{

	static void validate(char d)throws CustomException
	{
		if(d>='a' && d<='z')
			return;
		else if(d>='A' && d<='Z')
			return;
		else if(d>='0' && d<='9')
			return;
		else if(d ==' ')
			return;
		else
			throw new CustomException("Invalid Character");
	}

	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int f = 0;
		String inp = "";
		while(f == 0)
		{
			try
			{
				System.out.println("Enter the text: ");
				inp = br.readLine();
				for(int i = 0;i<inp.length();i++)
					validate(inp.charAt(i));
				f = 1;
			} 
			catch(CustomException e)
			{
				System.out.println("Invalid Input, Please try again: ");
			}
		}
		AmateurDetective obj = new AmateurDetective(inp);
		System.out.println("Enter the number of rails: ");
		int rail = Integer.parseInt(br.readLine());
		obj.encryption(rail);
		obj.decryption();
	}
}