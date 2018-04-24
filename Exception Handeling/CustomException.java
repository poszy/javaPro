public class CustomException {

public static void main(String args[]){

        String hello = "HELLO!";

        try{

                char[] arr   = hello.toCharArray();
                char lastIndex = arr[arr.length-1];

                if(arr.length < 10) {

                        throw(new Exception("My Custom Message"));

                }


                // substring index is smaller than .substring

                String sub = hello.substring(10);

        }catch(ArrayIndexOutOfBoundsException e) {

                e.printStackTrace();

        }catch(StringIndexOutOfBoundsException e) {
                // variable e can be used again because the scope of
                // the first e ends with the first catch
                System.out.println("String index Problem!!");

                // pro tip
                // Use catch blocks for any exception you think
                // your code will generate
        }catch(Exception e) {
                System.out.println(e.getMessage());

        }// For throw statment

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

}     // end main
} // end class
