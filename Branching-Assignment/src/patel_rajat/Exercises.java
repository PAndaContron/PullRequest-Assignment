/**
 * @author Rajat Patel
 */
package patel_rajat;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
	public static void main(String... args) {
		System.out.println(threeAndFive());
		System.out.println(evenFibSum());
		System.out.println(largestPrimeFactor());
	}
	
	public static int threeAndFive() {
		int s3 = (3 + 999) * 333/2;
		int s5_1 = (5 + 995) * 67/2;
		int s5_2 = (10 + 985) * 66/2;
		return s3+s5_1+s5_2;
	}
	
	public static int evenFibSum() {
		int sum = 0;
		for(int i=0;; i++) {
			int curr = fib(i);
			if(curr >= 4e6) {
				break;
			}
			if(curr % 2 == 0) {
				sum += curr;
			}
		}
		
		return sum;
	}
	
	private static int fib(int n) {
		return n < 2 ? n : fib(n-1) + fib(n-2);
	}
	
	public static int largestPrimeFactor() {
		long n = 600851475143l;
		long maxPrime = -1;

		while (n % 2 == 0) {
			maxPrime = 2;
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				maxPrime = i;
				n = n / i;
			}
		}

		if (n > 2)
			maxPrime = n;
		return (int) maxPrime;
	}

//	private static List<Integer> factorize(long num) {
//		List<Integer> list = new ArrayList<>();
//		
//		for(long i=2; i<num; i++) {
//			if(num % i == 0) {
//				long j = num/i;
//				list.addAll(arg0)
//			}
//		}
//	}
}
