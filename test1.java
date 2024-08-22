class Test1
{

	public void m1(){
		System.out.println("m1() method start");

	}

<<<<<<< HEAD
	public void m3(){
		System.out.println("m3() method start ---dev2");

=======
	public void m2(){
		int x=10;
		int y=20;
		System.out.println("Sum of two number is ::"+x+y);
>>>>>>> 447fdef505e95ba98548f4f4c4d2f976f0f85a82
	}

	public static void main(String args[]){
		Test1 t1= new Test1();
		t1.m1();
		t1.m2();
	}


}