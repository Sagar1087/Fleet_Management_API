public class InitalClass {

	public static void main(String[] args) {
		
		InitalClass aObj = new InitalClass();
		System.out.println("This is inital commits");
		aObj.Calc();
		NewFeatureMethod();
	}//end of main

	public void Calc()
	{
		System.out.println("x =" + 10);
	}
	
	public static void NewFeatureMethod() {
		
		System.out.println("Building new management feature!");
	}
}
