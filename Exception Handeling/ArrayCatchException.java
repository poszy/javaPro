public class ArrayCatchException{

    public static void main(String args[]){
	
	String hello = "HELLO!";
	
	try{
	
	    char[] arr   = hello.toCharArray();
	    char   lastIndex = arr[arr.length];
	
	}catch(ArrayIndexOutOfBoundsException e){
	    
	    e.printStackTrace();
	    
	}

	// This will make an Array out of bound Exception
	// because the index is over 1 index
	// add -1 for proper use of chars.lengh
	/*
	String s = null;
	System.out.println(s);
	
	String welcome = "Welcome!";
	// make aray chars = to welcome
	// make welcome into char[]
	
	char[] chars   = welcome.toCharArray();
	char lastChar  = chars[chars.length];
	System.out.println(lastChar);
        */
    
    } // end main
} // end class
