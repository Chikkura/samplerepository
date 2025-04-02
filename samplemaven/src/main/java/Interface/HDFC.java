package Interface;

public class HDFC implements RBI {
	
	double principal;
	int duration;
	double interestrate;
	

public static void main(String[] args) {
		
	HDFC obj =new HDFC();
	obj.recurringdeposit(1000, 2);
	obj.interestrate(.02);
	obj.displayTotalAmount(); 
	
	}


	
	public void recurringdeposit(double principal,int duration) {
		this.principal = principal;
		this.duration =duration;
		
		
	}
	
	
	public void interestrate(double d) {
		this.interestrate = .02d;
		
		
	}
	public void displayTotalAmount() {
        double interest = principal * duration * interestrate;
        double totalAmount = principal + interest;
	 
	    
    System.out.println("Total Amount after " + duration + " years: ₹" + totalAmount);
   }


}
	
	

