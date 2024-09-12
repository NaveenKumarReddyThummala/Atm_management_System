package atmmachine;
import java.util.Scanner;
public class main_class {
    public static void main(String[] args)
    {
    	atmoperationinterface op = new atmoperationimp();
    	int atm_number = 12345;
    	int atm_pin = 123;
    	Scanner scn = new Scanner(System.in);
    	System.out.println("enter the atm_number");
    	int atmnumber = scn.nextInt();
    	System.out.println("enter the atm_pin_number");
    	int atmpin = scn.nextInt();
    	if(atm_number==atmnumber && atm_pin==atmpin)
    	{
    		System.out.println("valid atm pin");
    		while(true)
    		{
    			System.out.println("1.view_balance \n 2.withdraw_amount \n 3.deposit_amount \n 4.view_mini statment \n 5.exit");
    		    System.out.println("enter the choice");
    		    int ch = scn.nextInt();
    		    if(ch==1)
    		    {
    		    	op.viewbalance();
    		    }
    		    else if(ch==2) {
    		    	System.out.println("enter amount to withdraw");
    		    	double withdrawamount = scn.nextDouble();
    		    	op.withdrawamount(withdrawamount);
    		    
    		    }
    		    else if(ch==3)
    		    {
    		    	System.out.println("enter the deposit");
    		    	double depositamount = scn.nextDouble(); //5000
    		    	op.depositamount(depositamount);
    		    }
    		    else if(ch==4)
    		    {
    		    	
    		    }
    		    else if(ch==5)
    		    {
    		    	System.out.println("please collect your card");
    		    }
    		    else
    		    {
    		    	System.out.println("enter correct option");
    		    }
    		}
    		
    	}
    	else
    	{
    		System.out.println("in_valid atm_pin");
    	}
    	
    	
    }
}
