package com.ksv.study;
interface Interface1{
	public void getData();
}
interface Interface2{
	public void getData();
}

class Parent1 {
	
	int i;
	String name;
	
	Parent1(int i, String name){
		System.out.println("Parent1 Constructor called");
		this.i = i;
		this.name = name;
	}
}
class Parent2 extends Parent1{
	int age;
	String address;
	
	Parent2(int age, String address){
		super(10, "Kalidas");
		System.out.println("Parent2 Constructor called");
		this.age = age;
		this.address = address;
	}
	
}
 
public class InheritanceTest extends Parent2 implements Interface1,Interface2{
	
	static int i,j,k;
	
	public InheritanceTest(){
		super(24, "Puthenpurayil House");
		System.out.println("Inheritance Test Constructor called");
	}
	
	@Override
	public void getData() {
		for (i = 0; i<3; i++){
			for(j = 1; j<4; j++){
				for(k = 2; k<5; k++){
					if((i==j) && (j==k)){
						System.out.println(i);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		InheritanceTest t = new InheritanceTest();
		t.getData();
		System.out.println(t.i+" "+t.name+" "+t.age+" "+t.address);
	}

}