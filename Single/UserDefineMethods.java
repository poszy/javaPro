import java.util.*;

public class UserDefineMethods {

// Global Vars
static Scanner in  = new Scanner(System.in);

public static void main(String args[]){

        double total = getTotal();
        print(total);

}    //end Main

public static double getTotal(){

        double total = 0;
        Boolean moreItems = true;
        char response;

        while(moreItems) {
                total = total + getItemPrice(getItemName());
                System.out.println("More Items? (y/n)");

                response = in.next().charAt(0);

                if(response != 'y' && response != 'Y') {
                        moreItems = false;
                        in.nextLine();

                }// end if

        } // end while

        return total;

}    // end getTotal

public static String getItemName(){
        String name;
        System.out.println(" Enter Item name ");
        name = in.nextLine();
        return name;

}    // end getItemName

public static double getItemPrice(String value){
        double price = 0;
        try{

                System.out.println(" Enter price for " + value + ": " );
                price = in.nextDouble();

        }catch(Exception e) {

                System.out.println(" Invalid data type entered ");
                e.printStackTrace();

        } // end try catch

        int quantity = getItemQuantity();
        return quantity * price;

}    // end get ItemPrice

public static int getItemQuantity(){

        int quantity = in.nextInt();
        return quantity;

}    // end getItemQuantity

public static void print(double total){

        System.out.println(total);

}

}// End class
