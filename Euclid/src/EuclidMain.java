
public class EuclidMain {

	public static void main(String[] args) {
		System.out.println(relPrime(5040)); // 11
		System.out.println(relPrime(840)); // 11
		System.out.println(relPrime(10060)); // 3
		System.out.println(relPrime(0x7fff)); // 2
	}

	// Find m that is relatively prime to n.
	public static int relPrime(int n)
	{
	   int m;

	   m = 2;

	   while (gcd(n, m) != 1) {  // n is the input from the outside world
	     m = m + 1;
	   }

	   return m;
	}
	   

	// The following method determines the Greatest Common Divisor of a and b
	// using Euclid's algorithm.
	public static int gcd(int a, int b)
	{
	  if (a == 0) {
	    return b;
	  }

	  while (b != 0) {
	    if (a > b) {
	      a = a - b;
	    } else {
	      b = b - a;
	    }
	  }
	  return a;
	}
	  
}
