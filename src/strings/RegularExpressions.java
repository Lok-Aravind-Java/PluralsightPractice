package strings;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String s1 ="apple,apple and orange please";
		
		/////replaceAll method
		String s2 =s1.replaceAll("ple", "ricot");
        System.out.println(s2);
        
        String s3 = s1.replaceAll("ple\\b", "ricot");
        System.out.println(s3);
	
	    ///////Split method and matches method
        
        String[] parts = s1.split("\\b");
        for(String st : parts){
        	if(st.matches("\\w+")){
        	System.out.print(st + "\t");
        }
        }
	}

}
