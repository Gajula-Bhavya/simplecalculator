import java.util.Scanner;
import java.lang.Math;

public class Main
{
    
    public static void main(String[] args)
    {
        boolean option=true;
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        
        int n=1;
        double counter=0;
    
        while(counter<n)
        {
            System.out.println("Round:"+n);
            n++;
        
        while(option)
        {
        System.out.println("welcome to the calculator 1");
        System.out.println("Enter 1 to stop the program");
        System.out.println("Enter 2 for multiplication");
        System.out.println("Enter 3 for difference");
        System.out.println("Enter 4 for sum");
        System.out.println("Enter 5 for division");
        System.out.println("Enter 6 for square root");
        System.out.println("Enter 7 for power");
        System.out.println("Enter 8 for modulo");
          

        System.out.println("Choose the number:");
        int menu=sc.nextInt();
    
        System.out.println("Enter your calculation option please(1-8)");
        menu=sc.nextInt();

        if(menu==1)
        {
            option=true;
            System.out.println("Enter 1 to stop the program");
            break;
        }  
        else if(menu==2)
        {
            option=true;
            System.out.println("multiplication of two numbers");
            System.out.println("Enter the First number");
            num1=sc.nextDouble();
            System.out.println("Enter the second number");
            num2=sc.nextDouble();
            System.out.println("Results of the two numbers is:");
            System.out.println(num1*num2);
            break;
        }
        else if(menu==3)
        {
            option=true;
            System.out.println("difference of two numbers");
            System.out.println("Enter the First number");
            num1=sc.nextDouble();
            System.out.println("Enter the second number");
            num2=sc.nextDouble();
            System.out.println("Results of the two numbers is:");
            System.out.println(num1-num2);
            break;
        }
        else if(menu==4)
        {
            option=true;
            System.out.println("sum of two numbers");
            System.out.println("Enter the First number");
            num1=sc.nextDouble();
            System.out.println("Enter the second number");
            num2=sc.nextDouble();
            System.out.println("Results of the two numbers is:");
            System.out.println(num1-num2);
            break;
        }
        else if(menu==5)
        {
            option=true;
            System.out.println("division of two numbers");
            System.out.println("enter the First number");
            num1=sc.nextDouble();
            System.out.println("Enter the second number");
            num2=sc.nextDouble();
            System.out.println("Results of the two numbers is:");
            System.out.println(num1/num2);
            break;
        }
        else if(menu==6)
        {
            option=true;
            System.out.println("square root of two numbers");
            System.out.println("Enter the number:");
            double X=sc.nextDouble();
            double R=Math.sqrt(X);
            System.out.println("The square root of "+ X +"is"+R );
            break;
        }
        else if(menu==7)
        {
            option=true;
            System.out.println("power of the number:");
            System.out.println("Enter the number");
            num1=sc.nextDouble();
            System.out.println("Enter the power:");
            num2=sc.nextDouble();
            System.out.println(Math.pow(num1,num2));
            break; 


        }
        else if(menu==8)
        {
            option=true;
            System.out.println("modulo of two numbers");
            System.out.println("enter the First number");
            num1=sc.nextDouble();
            System.out.println("Enter the second number");
            num2=sc.nextDouble();
            System.out.println("Results of the two numbers is:");
            System.out.println(num1%num2);
            break; 
        }
        else
        {
            System.out.println("choose the correct number up to 1 to 8");
            counter++;
            System.out.println(counter);
        }
        }
        }
    }
}


