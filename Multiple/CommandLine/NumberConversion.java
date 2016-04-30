public class NumberConversion{

    public static void main(String args[]){
	
	int firstArg = 0;
	if(args.length > 0){
	   
	    try{
		firstArg = Integer.parseInt(args[0]);
	    }catch(NumberFormatException e){
		System.err.println("Argument" + args[0] + "Must be and interger");
		System.exit(1);
	    }
	    System.out.println("You Entered"+ firstArg);
	} // end if
  } // end main
}// end Class
