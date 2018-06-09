package strings;

public class FormatterExample {

	public static void main(String[] args) {
	
		System.out.printf("%d \n",32);
		System.out.printf("%o \n",32);
		System.out.printf("%x \n",32);
		
		System.out.printf("%#o \n",32);
		System.out.printf("%#x \n",32);
		System.out.printf("%#X \n",32);
		
		System.out.println();
		
		//////FLag ////////////////
		
		System.out.printf("W:%d F:%d  \n",5,456);
		System.out.printf("W:%d F:%d  \n",356,1);
		
		////Flag to align it in order
		System.out.printf("W:%4d F:%4d  \n",5,456);
		System.out.printf("W:%4d F:%4d  \n",356,1);

		System.out.println();
		
		////// Flag 0 to align in order and fill the spaces with zero 
		System.out.printf("W:%04d F:%04d  \n",5,456);
		System.out.printf("W:%04d F:%04d  \n",356,1);

		System.out.println();
		
		///// Flag " , " to assign them according to the values
 		System.out.printf("%d \n",1234567);
 		System.out.printf("%,d \n",1234567);
 		System.out.printf("%,.2f \n",1234567.0);

		System.out.println();
		
 		System.out.printf("%d \n",123);
 		System.out.printf("%d \n",-456);
	
 		/// Flag space
 		System.out.printf("% d \n",123);
 		System.out.printf("% d \n",-456);
 		
 		/// Flag +
 		System.out.printf("%+d \n",123);
 		System.out.printf("%+d \n",-456);
 		
 		/// Flag  "("
 		System.out.printf("% (d \n",123);
 		System.out.printf("% (d \n",-456);
 		
 		
 		////////Argument Index /////////////////
 		System.out.printf("%d , %d , %d",100,200,300);
 		
 		/////Argument Index $ to use the argument in use
 		//String s =String.format("%$3d , %$1d , %$2d",100,200,300);
 		//System.out.println(s);
     	
 		/////Argument Index $ to use the argument in use
 	 	//System.out.printf("%$2d , %<04d , %$1d",100,200,300);
 		
 		
	}

}
