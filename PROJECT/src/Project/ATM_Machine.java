package Project;
import java.util.Scanner;

public class ATM_Machine 
{
   // main method starts
	
	
	public static void main(String[] args) {
		
		
		
		//TODO Auto-generated method stub
		//declare and initialize balance,withdraw,and deposit
		int balance = 0, withdraw, deposit;
		
		//create scanner class object to get choice of user
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
			
			
		
		{
			System.out.println("ATM Machine\n");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT\n");
			System.out.print("Choose the operation:");
			
			
			
			

			 // get choice from user
			
			int choice = sc.nextInt();
			switch(choice)
			{
			
			               case 1:
				System.out.print("Enter money to be withdraw:");
				
				//get the withdrawl money from user
				withdraw = sc.nextInt();
				
				//check whether the balance is greater than or equal to the withdrawal amount
				 
					if(balance >=withdraw)
				{
						// remove the withdrawl amount from the total balance
					
					balance = balance - withdraw;
					System.out.println("please collect your money");
				}
				else
				{
					//show custom error message
					System.out.println("Insufficient Balance");
					
				}
				System.out.println("");
			
				break;
				  
			                 case 2:
			                	 
			                	 
			                	 
				System.out.print("Enter money to be deposited:");
				
				deposit = sc.nextInt();
				balance  = balance  + deposit;
				
				System.out.println("youra Money has been successfully deposited");
				System.out.println("");
				
				
				break;
				
				
			                 case 3:
			                	 // displaying the total amount
			                	 System.out.println("Balance: "+balance);
			                	 System.out.println("");
			 	 break;
			 	 
			     	 
			     	 
			     	 
			                      case 4:
				//exit from the menu
				System.exit(0);
			}
			
		}
	}

}
