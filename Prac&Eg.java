pakege learingJava;

public class demo1
{

     public static void main (String[] args) {
      System.out.println("Hello world ")

    }
}


// Nested else if 


package practicejava;

public class PracticeJava {

	public static void main(String[] args)  {

	
	 int num1 = 40;
	 int num2 = 20;
	 int num3 = 30;
	 
	  if(num1  > num2 ) {
		  	
		  System.out.println("Number1 is greater than number 2");
		  
		
		  
		if(num2<num3) {
			
			System.out.println("Inside Nested if, Jo bhe result hai print kar do  ");
		}
		else {
			System.out.println("Nested else inside block");
		}
		
	  }
	  
		
	}
}




int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}



// while loop

package practicejava;

public class WhileLoopJava {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		while(i<=0) {
			
			System.out.println(i + "Hello");
			 i++;
		}
		
		
		//  Even number appraoch 1
		
		
		int i = 2;
		
	   while(i<=10) {
		   
		   System.out.println(i);
		   i+=2;
		   
	   }
	   
		
		
		
	   // Approcah 2
		
		
		
		int i = 1;

		while (i <= 10) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

			i++;
		}

		
		// Example 4 : 1.............10
		
//		1 odd
//		2 even
//		3 odd
//		4 even
//		..10even
		
		
	   int i = 1;
		
	  while(i<=10) {
		  
		  if(i%2==0) 
		  {
			  System.out.println(i+ "Even");
		  }
		  else
		  {
			  System.out.println(i+"Odd");
		  }
		  i++;
		  
	  }
		
	
		
	}

}



// Do while loop

ublic static void main(String[] args) {
		
		
		//example 1 : 1..........10 number print 
		
		int i  = 1;
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
	}




// Arrays and opration on array 


public class ArraysJava {

	public static void main(String[] args) {

		
		//  Declaring array 
		
		// approach 1
		
		int a[]= new int[5];
		
		a[0]=10;
		a[2]=30;
		a[3]=60;
		a[4]=40;
		
		System.out.println(a[3]);
		
		// Approach 2  most preferded 
		
	int a[] = {1,2,3,4,5,6,7,8,9};
	
	// find length of an array 
	  System.out.println( "Lendth of an array:"+ a.length);
	  // read single value from an array 
	 // System.out.println( a[1]);
		
	  // reading all the value of an array 
	  
	  Normanl for loop 
	  for( int i=0; i<a.length-1; i++)   // i<=4 i<5 i<=a.length-1  i<a.length
	  {
	
		System.out.println(a[i]);
//	  }
	  
	  // enhanced for loop . for... each loop 
	  
	  for(int x:a)
	  {
		  System.out.println(x);
	  }
	}

}



// Examples with createing and  opration in multi dimensional array:-

public class TwoDimentionalArray {

	public static void main(String[] args) {

		//  Declearing array 
		
		// aproach1
		
    	int a[][]=new int[3][2];
    	int []a[]=new int[3][2];   you can make like this also 
    	int [][]a=new int[3][2];     you can make like this also 
		
		
 		a[0][0] =100;
 		a[0][1] =200;
 		
 		a[1][0] = 300;
 		a[1][1] = 400;
 		
 		a[2][0] = 500;
 		a[2][1] = 600;
		
		
		// Approach2 
		
		int a[][] = { {100,200},
				      {300,400},
				      {500,600},
				      {700,800} 
		                        };
		                        
		// find size of an array
		
      		System.out.println("lendth of rows:"+a.length);
      		System.out.println("lendth of columns:"+a[0].length);
		
		// read single value from an array 
      		
          System.out.println(a[2][1]);   // 600
      
      
          // normal for getting all element of array , row and column 
          for(int r=0; r<=2;r++)               // 0
          {
        	  for(int c =0; c<=1; c++)         // 0 1 2
        	  {
        		  System.out.print(a[r][c]+ " ");   // 100 200
        	  }
        	  System.out.println();
          }
          
		
	}




// Liner Search:- Every  element we are compareing 


// Finding  element in this arry 


class Main {
    public static void main(String[] args) {
     int a[] = {10,20,30,40,50};
     int seacrch_element = 30;
     boolean status= false;  // false - not found  true- found 
       
       for(int i=0; i<a.length; i++)
       {
           if(a[i]==seacrch_element)
           {
               System.out.println("Element Fount");
               status = true;
               break;
           }
       }
       if(status ==false)
       { 
           System.out.println("Element not Found");
       }
       
     
    }
}

---------------------------------------------------------------------------------------------
EX:2-
// Fing number of repetations


public class FindDuplicateNum {

	public static void main(String[] args) {
		
		int a[] = {100,200,300,400,100,300,200,100};
		
		int num = 100;
		int count =0;
		
		for(int value:a)
		
		{
			
			if(value ==num)
				
			{
				count++;
			System.out.println(count);
			}
		}

	}

}
----------------------------------------------------------------------------------
// Sortng mumber and words

public class Sorting {

	public static void main(String[] args) {
	
		int a[] = {100,300,89,500,400};
		
		String b[] = {"ABC", "XYZ", "BCQ","LGTV"};
		
//	 System.out.println(Arrays.toString(a));
//		// sorting arrays 
//      Arrays.sort(a);
//      System.out.println(Arrays.toString(a));
		
		// sorting String arrays
		
		System.out.println("Before sorting String array");
		
		Arrays.sort(b);
		System.out.println("After sorting String array"+ Arrays.toString(b));
		
	}

}
--------------------------------------------------------------------------------------
// Taking Input from keyboard 
import java.util.Scanner;

public class HowtoReadDataInRuntime {

	public static void main(String[] args) {
		
		 // Taking inputs from keyboard  using this method
		Scanner sc = new Scanner(System.in);
		
		// for Taking input from keyboard 
		  
System.out.println("Enter the Number");
		 int num = sc.nextInt();
		 System.out.println("Given Number is: "+num);
		 
		
		// For decimal number
	System.out.println("Enter the Decimal Number");
		double num = sc.nextDouble();
		System.out.println("Given Decimal Number is:"+num);
		
		
		// For input String
		
		System.out.println("Enter your city Name");
		String city = sc.next();
		System.out.println("Your city is:"+ city);
		
	}

}