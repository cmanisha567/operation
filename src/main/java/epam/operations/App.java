package epam.operations;

import java.util.Scanner;
class App
{
   static void add(int a,int b)
   {
   int sum=a+b;
   System.out.println(sum);
   }

static void sub(int a,int b)
{
int diff=a-b;
System.out.println(diff);
}

static void mul(int a,int b)
{
int pro=a*b;
System.out.println(pro);
}

static void div(int a,int b)
{
try{
          float result = a/b;
          System.out.println(result);
      } 
      catch (ArithmeticException e) {
         System.out.println ("Can't be divided by Zero\nplease enter proper number\n " + e);
      }
}

public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int x=0;
while(x==0)
{
System.out.println("enter operation to be performed:\n 1.addition\n 2.subtraction\n 3.multiplication\n 4.division\n 5.exit");
int choice=ob.nextInt();
if((choice==5)||(choice>5))
{
x=1;
}

else{
System.out.println("enter two numbers:");
int one=ob.nextInt();
int two=ob.nextInt();
if(choice==1)
{
add(one,two);
}
if(choice==2)
{
sub(one,two);
}
if(choice==3)
{
mul(one,two);
}
if(choice==4)
{
div(one,two);
}
}

}
}
}







