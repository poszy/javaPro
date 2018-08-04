/**
 * Created by luispena on 8/2/18.
 * Generic types can also have return GenericTypes
 * 
 */

public class GenericTypesReturned {


  public static void main (String args[]){

    // I am not really sure how the comparing strings works.
    // this will print out this21
    System.out.println(maximumValue(60,21,50));
    System.out.println(maximumValue("this","this1112","this21"));

  }

  // This method will only take in parameters that are inside the
  // Comparable class. This is done so we can compare different types of data
  // without having to cast or having to use operators.
  public static <T extends Comparable<T> > T maximumValue(T valueA, T valueB, T valueC) {

    T maxValue = valueA;

    if (valueB.compareTo(valueA) > 0)   { maxValue = valueB; }
    if (valueC.compareTo(maxValue) > 0) { maxValue = valueC; }

    return maxValue;
  }


}
