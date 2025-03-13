package inheritance;

public class ClassworkParent1 extends ClassworkParentclass {

    int hra;
    int pf;

    public void calculateAllowances() {
        hra = (5 * basicpay) / 100;
        pf = (20 * basicpay) / 100;

        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
    }

    public void display() {
        int totalSalary = basicpay + bonus + hra - pf - deduction;

        System.out.println("Total Salary By Hand: " + totalSalary);
    }
}


