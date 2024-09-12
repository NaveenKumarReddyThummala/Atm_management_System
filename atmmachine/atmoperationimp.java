package atmmachine;

public class atmoperationimp implements atmoperationinterface
{
    Atm atm = new Atm();
	@Override
	public void viewbalance() {
		
		 System.out.println("available balance is :"+atm.getBalance());   
	}

	@Override
	public void withdrawamount(double withdrawamount) {
		if(withdrawamount<atm.getBalance()) {
		System.out.println("collect the cash"+withdrawamount);
		atm.setBalance(atm.getBalance()-withdrawamount);
		viewbalance();}
	}

	@Override
	public void depositamount(double depositamount) {
	    System.out.println(depositamount +"deposit sucess");
	    atm.setBalance(atm.getBalance()+depositamount);
	    viewbalance();
	}

	@Override
	public void viewministatement() {
		
		
	}
     
}
