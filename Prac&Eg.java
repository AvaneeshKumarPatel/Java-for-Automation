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





