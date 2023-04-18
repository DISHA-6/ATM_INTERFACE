import java.util.*;   
public class ATM_Interface  
{  
    public static void main(String args[] )  
    {   
        int balance = 4000000, withdraw, deposit;   
        Scanner input = new Scanner(System.in); 
        String t=""; 
        String w="";
          
        while(true)  
        {  
            System.out.println("Welcome to the Interface...");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for to Check Transaction History");  
            System.out.println("Choose 5 to EXIT");
            System.out.print("Choose the operation you want to perform:");  
            int ch = input.nextInt();  
            switch(ch)  
            {  
                case 1:  
                    System.out.print("Enter money to be withdrawn:");  
                    withdraw = input.nextInt(); 
                    if(balance >= withdraw)  
                    {  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money.");  
                    }  
                    else  
                    {    
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println(""); 
                    w=w+"[withdrawal of "+withdraw+"]"; 
                    break;  
                case 2:  
                        
                    System.out.print("Enter money to be deposited:");  
                    deposit = input.nextInt();    
                    balance = balance + deposit;
                    t = t + "[deposit of " + deposit +"]";  
                    System.out.println("Your Money has been successfully deposited.");  
                    System.out.println("");  
                    break;  
        
                case 3:   
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;  
        
                case 4:
                    System.out.println("Transaction History :"+t+w);
                    System.out.println("");
                    break;
                
                case 5:   
                    System.exit(0);  
             }  
        }  
    }  
}