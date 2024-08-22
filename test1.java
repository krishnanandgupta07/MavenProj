class Test1
{

	public void m1(){
		System.out.println("m1() method start");

	}


	public void m3(){
		System.out.println("m3() method start ---dev2");


	public void m2(){
		int x=10;
		int y=20;
		System.out.println("Sum of two number is ::"+x+y);
	}


	public void m5(){
		System.out.println("m5() method start");

	public static int m4(){
		int a=7;
		System.out.println("Square of a number is::"+a*a);

	}

	public static void main(String args[]){
		Test1 t1= new Test1();
		t1.m1();
		t1.m2();
	}


}