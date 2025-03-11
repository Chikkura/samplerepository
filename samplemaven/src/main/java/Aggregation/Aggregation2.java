package Aggregation;

public class Aggregation2 {
	String city,state;
	Aggregation1 ref;
	public Aggregation2(String city,String state, Aggregation1 ref)
	{
		this.city = city;
		this.state =  state;
		this.ref = ref;
	}
	public void display(){
		System.out.println(ref.name+" "+ref.rollnumber);
		
		System.out.println(city+"  "+state);
	}

	public static void main(String[] args) {
		Aggregation1 obj = new Aggregation1("Chikkapa",56,31);
		Aggregation2 obj1 = new Aggregation2("Tvm"," Kerala", obj);
		obj1.display();
		

	}

}
