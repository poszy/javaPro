import java.util.Random;

public class HigherLower {


    public static void main (String args[]){

	Random RandomGenerator = new Random();

	int randomNumber = RandomGenerator.nextInt(11) + 10;

	System.out.println(randomNumber);


	Random Ten = new Random();
	int TenTwen = Ten.nextInt(11);
	System.out.println(TenTwen);
	
    }



}
