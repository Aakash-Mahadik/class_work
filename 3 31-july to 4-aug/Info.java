class Info{

	String name,address;
	int age;

   	void tellName(){
		System.out.println("Name is: "+name);
	}
	void tellAddress(){
		System.out.println("Address is: "+address);
	}
	void tellAge(){
		System.out.println("Age is: "+age);
	}
	public static void main(String[]args){
		
		Info obj = new Info();
		obj.name = "Aakash";
		obj.address = "Mumbai";
		obj.age = 21;
		
		obj.tellName();
		obj.tellAddress();
		obj.tellAge();

		System.out.println("My Name is: "+obj.name);
		System.out.println("My Address is: "+obj.address);
		System.out.println("My age is: "+obj.age);
	}
}
	