import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class AtmSimpleApp
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit, pin;
		int state = 0;
		boolean pinExists = false;
        String name = "";
		Scanner s = new Scanner(System.in);
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		hash_map.put("adam", 1234);
        hash_map.put("steve", 5678);
		int outer = 0;
		
		if(state == 0){
			System.out.println("\nATM Machine to withdraw funds \n");
			System.out.println("Please Enter Your Right Secret Pin");
		}
		pin = s.nextInt();
		pinExists = hash_map.containsValue(pin);
		
		
		if(pinExists == true){
		
			for (Map.Entry<String, Integer> entry : hash_map.entrySet()) {
				if (entry.getValue().equals(pin)) {
					name = entry.getKey();
				}
			}
	
	 
		outer: while(true)
        {
			
			
			
			System.out.println("Welcome "+name);
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            
			switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
				    state = 2;	 
					
					System.out.print("\n");
					System.out.print("Press 1 for more operations or 4 for exit");
					int press = s.nextInt();
					switch(press)
					{
						case 1:
						break;
						
						 case 4:
                         System.exit(0);
						 
					}	
                }
                else
                {
                    System.out.println("Insufficient Balance");
					state = 2;	 
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
				state = 2;	 
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
				state = 2;
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
			
			}
			
			
        }else{
				
				System.out.print("Wrong Pin! ");
								
			}
    }
}
