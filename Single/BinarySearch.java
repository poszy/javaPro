import java.util.Arrays;

public class BinarySearch {

  public static void main (String [] args){
    int[] searchArray = { 10,20,30,40,50,60,70,80,90,100 };
    int key = 50;
    int min = 0;
    int max = searchArray.length-1;
    binarySearch(searchArray, min , max, key);
    System.out.println(max);
  }

  public static void binarySearch(int array[], int firstI, int lastI, int key){

    int midI = (firstI + lastI) / 2 ;

    while (firstI <= lastI){
      if (array[midI] < key ) {
        firstI = midI +1;
      }
      else if ( array[midI] == key ) {
        System.out.println("Element is found at index: " + midI);
        break;
      }
      else{
        lastI = midI -1;
      }
      midI = (firstI + lastI) / 2;
    }

    if ( firstI > lastI ) {
      System.out.println("element not found");
    }
  }

} // end binary search
