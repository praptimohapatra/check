package pkg1;

//abstract public class TestCase {
	//abstract void m1();
	public abstract class TestCase {	
	    abstract void m1();
	    TestCase(){ }
	    static void m2() {System.out.println("Hello Java!"); }
	    }
	   public class B extends TestCase {
	     void m1(){
	        TestCase.m2(); 
	     }
	    }


