class HelloAssignment1
{
	public static void main(String [] args)
	{
		System.out.println("Hello World");
		System.out.println("Welcome to CDAC Mumbai Kharghar");
	}

	}

------------------------------------------------------------------------------------
2.write a java program addition of two no

class Addition
{
	public static void main(String [] args)
	{
		int num1=74,num2=36;
		int Add=num1+num2;
		System.out.println("addition="+Add);
	}
		
	}
or
import java.util.*;
class add

{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter two no:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int add=i+j;
		
		System.out.println("addition="+Add);
	}
		
	}
------------------------------------------------------------------------------------------
3.write a java program divide two no

class division
{
	public static void main(String [] args)
	{
		int num1=50,num2=3;
		int Add=num1/num2;
		System.out.println("division="+div);
	}
		
	}

--------------------------------------------------------------------------------------------
4.write a program result of following 
import java.util.Scanner;

class Assignment
{
 public static void main(String args[])
 
 {
   int a,b,c,d,e,f;
   Scanner sc=new Scanner(System.in);
   System.out.println("Please enter 3 no for operation 1");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   int i=a+b*c;
   
   System.out.println("Result of operation 1 :"+ i);
   System.out.println("Please enter 3 no for operation 2");
   
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();

   int j=a+b;
   int k=j%c;
   
    System.out.println("Result of operation 2 :"+ k);
    System.out.println("Please enter 4 no for operation 3");
	
	a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
   
   
   int l= a+b*c/d;
   
   System.out.println("Result of operation 3 :"+ l);
   
    System.out.println("Please enter 6 no for operation 4");
	
	a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    f=sc.nextInt();
	
	int m=a+b/c*d-e%f;
    
      System.out.println("Result of operation 4 :"+m);
 }
}
-------------------------------------------------------------------------------------------------------
5.................
import java.util.*;
class multiplication
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("enter two no:");
int i=sc.nextInt();
int j=sc.nextInt();
int div=i*j;
System.out.println(i+"*"+j+"="+mul);}
}

-----------------------------------------------------------------------------------------
6.addition multiplication division mod subtraction
import java.util.Scanner;

public class asdmmr
{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int a = myObj.nextInt();
	
	System.out.println("Enter b number:");
	int b = myObj.nextInt();
	
	int c = a+b;
	int d = a-b;
	int e = a*b;
	int f = a/b;
	int g = a%b;
	
	System.out.println("Addition of a and b is :" +c);
	System.out.println("Substraction of a and b is :" +d);
	System.out.println("Multiplication of a and b is : " +e);
	System.out.println("Division of a and b is :" +f);
	System.out.println("Modulus of a and b is :" +g);
	}
}



------------------------------------------------------------------------------------------------
7.print multiplication table upto 10

import java.util.*;
class table
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x=sc.nextInt();
int end=11;
for(int start=1;start<end;start++)
{
int y=start*x;
System.out.println(x+"*"+start+"="+y);
}
}
}

-----------------------------------------------------------------------------------
8.display following pattern
public class patternj
{
	public static void main(String[] args){
		System.out.println("   j    a    v     v    a ");
		System.out.println("   j   a a    v   v    a a ");
		System.out.println("j  j  aaaaa    v v    aaaaa ");
		System.out.println(" jj  a     a    v    a     a");
	}
}
----------------------------------------------------------------------------------------
9.specific expresssion and output
class formula1
{
public static void main(String args[])
{
System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));
}}

----------------------------------------------------------------------------------------------------
10.specified formula
class formula
{
	public static void main(String [] args)
	{
		System.out.println(4.0*( 1- (1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11) ));
	}
} 
---------------------------------------------------------------------------------------------------------------
11.perimeter and area of circle
import java.util.*;
class area
{
public static void main(String args[])
{
double radius=7.5D;
double perimeter=2*Math.PI*radius;
double area=Math.PI*radius*radius;
System.out.println("perimeter="+perimeter);
System.out.println("area="+area);
}
}

-----------------------------------------------------------------------------------------
13 average
import java.util.Scanner;

public class average
{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = myObj.nextInt();
		
		System.out.println("Enter b number:");
		int b = myObj.nextInt();
		
		System.out.println("Enter c number:");
		int c = myObj.nextInt();
		
		int d = (a+b+c)/3;
		System.out.println("Average of three numbers is:" +d);
	}
}
------------------------------------------------------------------------------------------------------
13 rectangle perimeter and area
public class rectangle
{
	public static void main(String[] args){
		double a = 5.5;
		double b = 8.5;
		double area = a*b;
		double perimeter = 2*(a+b);
		
		System.out.println("Area of the circle:" +area);
		System.out.println("Perimeter of the circle:" +perimeter);
	}
}


-------------------------------------------------------------------------------------------

14.american flag
public class assignmentq14{
	public static void main(String[] args){
		System.out.println("* * * * * * ==========================");
	System.out.println(" * * * * *  ==========================");
	System.out.println("* * * * * * ==========================");
	System.out.println(" * * * * *  ==========================");
	System.out.println("* * * * * * ==========================");
	System.out.println(" * * * * *  ==========================");
	System.out.println("* * * * * * ==========================");
	System.out.println(" * * * * *  ==========================");
	System.out.println("* * * * * * ==========================");
	System.out.println("======================================");
	System.out.println("======================================");
	System.out.println("======================================");
	System.out.println("======================================");
	System.out.println("======================================");
	System.out.println("======================================");
	System.out.println("======================================");
	}
	
--------------------------------------------------------------------------------
15.swap
import java.util.*;
class swap
{
public static void  main(String args[])
{
int i=10;
int j=20;


System.out.println("before swapping:");
System.out.println("i: "+i);
System.out.println("j: "+j);



int temp=i;
i=j;
j=temp;



System.out.println("after swapping:");
System.out.println("i: "+i);
System.out.println("j: "+j);
}
}

------------------------------------------------------------------------------------------------
16.print a face

class face
{
  public static void main(String args[])
  {
  System.out.println( "  + \" \" \" \"+  ");
  System.out.println( "[ |   0    0   | ]");
  System.out.println( "  |      ^     |   ");
  System.out.println( "  |     '-'    |   ");
  System.out.println( "  +------------+   ");
  }
  
} 
--------------------------------------------------------------------------------
17 addition of two binary number
public static void main(String args[])
{
   Scanner scnr=new Scanner(System.in);
     
	 System.out.println("enter first binary no:");
	 String first=scnr.nextLine();
	 
	 System.out.println("enter second binary no:");
	 String second=scnr.nextLine();
	 
	 String addition=add(first,second);
	 System.out.println("enter two binary no addition;"+addition);
	 
	 scnr.close();
	 }
	 }
---------------------------------------------------------------------------
multiplay two binary
import java.util.Scanner;
public class assignmentq18{
 public static void main(String[] args)
 {
  long binary1, binary2, multiply = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Input the first binary number: ");
  binary1 = in.nextLong();
  System.out.print("Input the second binary number: ");
  binary2 = in.nextLong();
  while (binary2 != 0)
  {
   digit = (int)(binary2 % 10);
   if (digit == 1) 
   {
    binary1 = binary1 * factor;
    multiply = binaryproduct((int) binary1, (int) multiply);
   } 
   else
   {
    binary1 = binary1 * factor;
   }
   binary2 = binary2 / 10;
   factor = 10;
  }
  System.out.print("Product of two binary numbers: " + multiply+"\n");
 }
 static int binaryproduct(int binary1, int binary2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }
 -------------------------------------------------------------------------------------------
19....decimal to binary
public class assig
{
	public static void main(String[] args){
		int binary[] = new int[20];
		int index = 0;
		int n = 10;
		while(n>0){
			binary[index++] = n%2;
			n=n/2;
		}
		for(int i=index-1; i>=0; i--){
			System.out.print(binary[i]);
		}
		System.out.println();
	}
}

---------------------------------------------------------------------
20. decimal no to hexa
public class hexa
{
	public static void main(String[] args){
	int a;
	int n = 10;
	String hex = "";
	char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	while(n>0){
		a=n%16;
		hex=hexchars[a]+hex;
		n=n/16;
	}
		System.out.println("Binary to hex is :"+hex);
	}
}

--------------------------------------------
21 decimal to octal no
public class octal
{
	public static void main(String[] args){
		int binary[] = new int[20];
		int index = 0;
		int n = 15;
		while(n>0){
			binary[index++] = n%8;
			n=n/8;
		}
		for(int i=index-1; i>=0; i--){
			System.out.print(binary[i]);
		}
		System.out.println();
	}
}

----------------------------------------------------------------------
22,.binary to decimal
import java.util.Scanner;
public class decimal
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  long binaryNumber, decimalNumber = 0, j = 1, remainder;
  System.out.print("Input a binary number: ");
  binaryNumber = sc.nextLong();

  while (binaryNumber != 0) 
  {
   remainder = binaryNumber % 10;
   decimalNumber = decimalNumber + remainder * j;
   j = j * 2;
   binaryNumber = binaryNumber / 10;
  }
  System.out.println("Decimal Number: " + decimalNumber);
 }
}
----------------------------------------------------------------------
23.binary no to hexa
import java.util.Scanner;
public class hexa1
{
 public static void main(String[] args) 
 {
  int[] hex = new int[1000];
  int i = 1, j = 0, rem, dec = 0, bin;
  Scanner in = new Scanner(System.in);
  System.out.print("Input a Binary Number: ");
  bin = in.nextInt();
  while (bin > 0) {
   rem = bin % 2;
   dec = dec + rem * i;
   i = i * 2;
   bin = bin / 10;
  }
   i = 0;
  while (dec != 0) {
   hex[i] = dec % 16;
   dec = dec / 16;
   i++;
  }
  System.out.print("HexaDecimal value: ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55)+"\n");
   } else
   {
    System.out.print(hex[j]+"\n");
   }
  }
 }
}
------------------------------------------------------------------------
24.binary to octal
import java.util.*;
public class octal1
{
public static void main(String[] args) 
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");
 
    }
}
----------------------------------------------------------------------------------------
25.octal to decimal
import java.util.Scanner;

public class decimal
{
 
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long octal_num, decimal_num = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
    octal_num = in.nextLong();
    while (octal_num != 0) 
     {
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
      octal_num = octal_num / 10;
     }
    System.out.print("Equivalent decimal number: " + decimal_num+"\n");
   }

--------------------------------------------------------------------------------
