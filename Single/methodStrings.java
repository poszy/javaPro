public class methodStrings{

  public static void main(String args[]){

    String words[]= {"Linux","Unix","OSX","Windows"};
    String s = "findstuffinherefindstuffinhere";

      // : loops through a list of words in a sequence
      // String compare stores the values of the list (words) you are looping through
      // might not be ideal in some situations.

      for (String compare : words){
          if(compare.startsWith("Li")){
            System.out.println( compare + " Starts with Li");
          }

    System.out.print(s.indexOf("f"));
    

      }
  }
} //end class
