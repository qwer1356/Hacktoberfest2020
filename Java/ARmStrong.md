import java.util.Scanner;

class Armstrong{  
  public static void main(String[] args)  {  
    int c=0,a,temp;   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to be checked :");
    int n = sc.nextInt();//It is the number to check armstrong
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("Armstrong...");   
    else  
        System.out.println("Not Armstrong...");   
   }  
}  
