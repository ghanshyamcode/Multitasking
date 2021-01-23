/*Write a menu driven program for following:
(a) Display a Fibonacci series
(b) ComputeFactorial of a number
(c) WAP to check whether a given number is odd or even.
(d) WAP to check whether a given string is palindrome or not.*/

import java.util.*;            //importing scanner from util. use * instead of scanner to use full library.
public class multitask {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\t******MENU******\n(1) Display a fibonacci Series\n(2) Compute Factorial of Number\n(3) Check whether a given number is odd or even\n(4) check whether a given string is palindrome or not");
            System.out.println("Enter your choice: ");
            int ch = scan.nextInt();
            switch(ch){
            case 1:
                System.out.println("Enter No. to get your fibonacci series: ");
                int n=scan.nextInt();
                if(n>0){
                    if(n==1){
                        System.out.println("Fibonacci series till " +n+ " is: \n0");
                    }    
                    else if (n==2){
                        System.out.println("Fibonacci series till " +n+ " is: \n0,1");

                    }
                    else{
                        System.out.print("Fibonacci Series till " +n+ " is: \n0,1");    
                        int x=0, y=1;
                        for(int i=1; i<=n-2; i++){
                            int z=x+y;
                            System.out.print(","+z);
                            x=y;
                            y=z;
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Enter only Positive value");
                }
                break;    
                
            case 2:
                System.out.print("Enter a Number to find factorial: ");
                int num=scan.nextInt();
                int fact =1;
                for (int i=1; i<=num; i++){
                    fact*=i;
                }  
                System.out.println("Fcatorial of " +num+ " is: "+fact);
                break;  
            
            case 3:
                System.out.print("Enter a number: ");
                int n1= scan.nextInt();
                if (n1%2==0){
                    System.out.println(n1+" is an even Number");
                }    
                else{
                    System.out.println(n1+" is odd number");
                }
                break;    
            case 4:
            System.out.print("Enter a word: ");
            String str1= scan.next();
            String str2= "";                                         //taking a blank string 

            for (int i= str1.length()-1; i>=0; i--){                //Storing the word reversly for equating 
                str2 +=str1.charAt(i);

            }
            if (str2.equals(str1)){                                 //Equating line code for palindrome
                System.out.println(str1+ " is a palindrome.");
            }
            else{
                System.out.println(str1+" is not a palindrome.");

            }
            break;

        case 5:
            break;        

        default :
            System.out.println("Invalid choice.......");        
        }

    }
}
}
