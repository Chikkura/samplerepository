package inheritance;

public class ClassworkChild2 extends ClassworkParent1 {

    public static void main(String[] args) {

        ClassworkChild2 obj = new ClassworkChild2();

        obj.Paydetails();  
        obj.calculateAllowances(); 
        obj.display();  
        obj.salarySlip();
    }

    public void salarySlip() {
        int totalsalary = basicpay + hra + bonus - pf - deduction;

        System.out.println("Salary Slip: ");
        System.out.println("Basic Pay = " + basicpay);
        System.out.println("Deduction = " + deduction);
        System.out.println("HRA = " + hra);
        System.out.println("PF = " + pf);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary By Hand = " + totalsalary);
    }
}
