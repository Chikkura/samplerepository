package Encapsulation;

public class HoeworkParent {
	
int a;
int b ;
	
public void setter(int a, int b) {
 this.a=a;
 this.b =b;


}

public void getter() {
	int sum = a+b;
	System.out.println("Result is :" +sum);
}
}