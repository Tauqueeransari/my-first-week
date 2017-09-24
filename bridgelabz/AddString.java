import java.util.Scanner;

public class AddString 
{
	public void displayFullName(String firstName,String lastName)
   	{
        String fullName=firstName+lastName;
        System.out.println("your full name is:"+fullName);
    }
        public static void main(String[] args)
        {
        AddString add=new AddString();
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the first name");
        String c=sc.next();
        System.out.println("please enter the last name");
        String d=sc.next();
        add.displayFullName(c,d);
        }
}

            
            
            
            
