import java.util.*;


public class Collections{

  public static void main(String args[]){

    String[] things = {"eggs","beans","carrots","tomatoes"};

    List<String> list = new ArrayList<String>();
    // add items to list

    for(String i: things){
      list.add(i);
      String[] morethings = {"GMO","Organic"};
      }

      List<String> list2 = new ArrayList<String>();
      for(String x: things){
        list2.add(x);
        }

      for(int i = 0; i < list.size(); i++){
        System.out.printf("\n" + list.get(i));

      }


  }


}
