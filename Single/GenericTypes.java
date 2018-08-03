
/**
 * Created by luispena on 8/2/18.
 * GenericTypes for parameter types
 * GenericTypes are used to overload methods with a type
 *  instead of having to create an overload method for an int and char Array
 *  a generic type method can be used to take in different types.
 */

public class GenericTypes {

  public static void main (String [] args){

          Integer[]   iArray = {1,2,3,4,5};
          Character[] cArray = {'a','b', 'c', 'd', 'e'};

          System.out.println("This runs!");

          // Call out generic method
          printGenericType(iArray);
          printGenericType(cArray);
  }


  public static <T> void printGenericType(T[] ArrayPassedIn){

          // elementIndexInArray is an iterator that is going through the passed ArrayPassedIn
          // ArrayPassedIn is pass in through the method printGenericType and is iterated through

          for (T elementIndexInArray : ArrayPassedIn) {

                  System.out.printf("%s", elementIndexInArray);
          }

  }

}
