//Q1
import java.util.Scanner;
interface operation
{
    void input();
    void output();
}
class cylinder implements operation
{
    double r,h;
    public void input()
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter radius :");
         r=s.nextDouble();
         System.out.println("Enter Height :");
         h=s.nextDouble();
    }
    public void output()
    {
          double v=3.14*r*r*h;
          System.out.println("Volume of Cylinder : "+v);
    }
}
public class Slip11
{
     public static void main(String[] args)
     {
          cylinder c=new cylinder();
          c.input();
          c.output();
     }
}

//Q2
import java.util.Scanner;
class InvalidPasswordException extends Exception
{
    public InvalidPasswordException(String message) 
    {
        super(message);
    }
}

public class Slip11
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a username: ");
        String username = sc.nextLine();

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        try 
        {
          if (!username.equals(password)) 
          {
               throw new InvalidPasswordException("\nInvalid Password: The username and password do not match.");
          } 
            else           
            {
                System.out.println("\nUsername and password match. Access granted!");
            }
        } catch (InvalidPasswordException e) 
        {
            System.err.println(e.getMessage());
        } 
        finally 
        {
            sc.close();
        }
    }
}
