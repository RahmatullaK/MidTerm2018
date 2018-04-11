package math;

public class PrimeNumber {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				counter++;
				System.out.println(i);
			}
		}
		System.out.println("Total prime number up to this : " + counter);

	}

	public static boolean isPrime(int number) {
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= number; i = i + 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}
}



         /*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
//	//	 int i =0;
//	int num =0;
//	//Empty String
//	String  primeNumbers = "";
//
//    for (i = 2; i <= 1000000; i++)
//			{
//			int counter=0;
//			for(num =i; num>=1; num--)
//			{
//			if(i%num==0)
//			{
//			counter = counter + 1;
//			}
//			}
//			if (counter ==2)
//			{
//			//Appended the Prime number to the String
//			primeNumbers = primeNumbers + i + " ";
//			}
//			}
//			System.out.println("Prime numbers from 1 to 1000000 are :");
//			System.out.println(primeNumbers);
//			}
//			}



