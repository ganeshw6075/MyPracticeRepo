package MyProject;

public class SubClass extends SuperClass {
	
	
	
	int c;
	
	public void show()
	{  
		int a=10;
		int b=20;
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		SubClass ss=new SubClass();
		ss.show();
		ss.add();

	}

}
