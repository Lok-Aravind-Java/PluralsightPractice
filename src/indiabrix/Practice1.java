package indiabrix;

public class Practice1 {
	
	   final static short x = 2;
	   public static int y = 0;
	
	
	public static void main(String[] args) throws Throwable {
		 
		Practice1 p = new Practice1();
		
		p.finalize();
		Runtime.getRuntime().gc();
		
		
		boolean test = (p instanceof Practice1);
		
		
        for (int z=0; z < 3; z++) 
        {
            switch (z) 
            {
             //   case y: System.out.print("0 ");   /* Line 11 */
                case x-1: System.out.print("1 "); /* Line 12 */
                case x: System.out.print("2 ");   /* Line 13 */
            }
        }
		 
       
        int number = 10;
       
        assert (number>5):"not true"; 
       System.out.println("true");
	  }

}
