class Test1
{

	public void m1(){
		System.out.println("m1() method start");

	}

	public void m2(){
		int x=10;
		int y=20;
		System.out.println("Sum of two number is ::"+x+y);
	}

	public static void main(String args[]){
		Test1 t1= new Test1();
		t1.m1();
		t1.m2();
	}


}