package annotations;



public class SupressedAnnotation {

	
	@SuppressWarnings("deprecation")
	public void method1(){
		
		DeprecatedAnnotation da = new DeprecatedAnnotation();
		
		da.thisMethod();
		da.thisNewMethod();
		
	}
	
	
	
	@SuppressWarnings("deprecation")
	public void method2(){
		
		DeprecatedAnnotation da1 = new DeprecatedAnnotation();
		DeprecatedAnnotation da2 = new DeprecatedAnnotation();
		
		da1.thisMethod();
		da2.thisMethod();
		
		
	}
	
	
}
