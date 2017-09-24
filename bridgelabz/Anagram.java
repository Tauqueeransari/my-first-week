import java.util.Scanner;
public class Anagram{ 
    static String str1,str2;
     static int len,len1,len2,i,j,equal=0,notEqual=0;  
   public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	  System.out.println("enter the 1st string");
          str1=s.nextLine();
	  System.out.println("enter the 2nd string");
          str2=s.nextLine();
	  len1=str1.length();
	  len2=str2.length();	
	if(len1 == len2)
	{
		len=len1;
		
		for(i=0;i<len;i++)
		{
			equal=0;
			for(j=0;j<len;j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					equal=1;
					break;
				}
			}
			if (equal==0)
			
				notEqual=1;
			break;
			
			}
		}
		if (notEqual==1)
		{
			System.out.println("not anagram");
		}
		else
		{
			System.out.println("anagram");
		}
	}
}

			
	
	 
	
	
    
	
    
	
