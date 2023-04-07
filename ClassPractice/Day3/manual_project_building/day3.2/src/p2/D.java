package p2;
import p1.A;
class D extends A{
	D(){
		super();//super is addes implicitly by the compiler.
		System.out.println("D's state "+i+" "+j+" "+k+" "+l);
	}
	
}