package Aggregation;

public class AggregationChildHomework {

	
	String accounttype;
	String nominee;
	AggregationParentHomework ref;
	
public AggregationChildHomework(String accounttype, String nominee,AggregationParentHomework ref)
{
this.accounttype= accounttype;
this.nominee= nominee;
this.ref =ref;

}
public void display() {
    System.out.println(ref.accountholdername+"  "+ref.accountnumber);
    System.out.println("Nominee: " + nominee);
   

}

	

public static void main(String[] args) {
	AggregationParentHomework obj = new AggregationParentHomework("Chikku", 890);
	AggregationChildHomework obj1 = new AggregationChildHomework("Savings", "Nihar",obj);
	obj1.display();

}
}
