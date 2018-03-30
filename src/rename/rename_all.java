package rename;

import java.io.File;
 
public class rename_all
{
    public static void main(String[] args)
    {	
    	File folder= new File("D:\\1861200");
    	File[] listOfFiles= folder.listFiles();
    	
    	for(int h=0;h<listOfFiles.length;h++)
    	{
 
		File oldfile =new File("D:\\1861200\\"+listOfFiles[h].getName());

		File newfile =new File("D:");
		
		
		int j=0;
		
		String txt= oldfile.getName();
		
		String txt2="";
		
		
		
		for (int i=0;i<txt.length();i++)
		{
		String txt1= txt.substring(i, i+1);
		
			if(txt1.equals("0"))
			{
				txt1="a";
			}
			else if(txt1.equals("1"))
			{
				txt1="b";
			}
			else if(txt1.equals("2"))
			{
				txt1="c";
			}
			else if(txt1.equals("3"))
			{
				txt1="d";
			}
			else if(txt1.equals("4"))
			{
				txt1="e";
			}
			else if(txt1.equals("5"))
			{
				txt1="f";
			}
			else if(txt1.equals("6"))
			{
				txt1="g";
			}
			else if(txt1.equals("7"))
			{
				txt1="h";
			}
			else if(txt1.equals("8"))
			{
				txt1="i";
			}
			else if(txt1.equals("9"))
			{
				txt1="j";
			}
			else if(txt1.equals("t"))
			{
				txt1="t";
			}
			else if(txt1.equals("x"))
			{
				txt1="x";
			}
			else if(txt1.equals(" "))
			{
				txt1="";
			}
			else if(txt1.equals("("))
			{
				txt1="";
			}
			else if(txt1.equals(")"))
			{
				txt1="";
			}
			else if(txt1.equals("j"))
			{
				txt1="j";
			}
			else if(txt1.equals("p"))
			{
				txt1="p";
			}
			else if(txt1.equals("g"))
			{
				txt1="g";
			}
			
			
			txt2=txt2+txt1;
			
			
			
		}
		System.out.println(h+1);
		
		File f =new File(newfile+txt2);
		
		oldfile.renameTo(f);
		j=1;
		
		
		
		if(j==1){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}
    	}
 
    }
}