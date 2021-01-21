package luups;


public class NumberMethods {
	
	public static boolean isPrime(int n) {
		boolean prime = false;
		int mult = 1;
		int store = 0;
		int i;
		int count = 0;
		
		
		for(i = 1; i < n; i = i + 1) {
			while(mult < n) {
				store = i * mult;
				mult++;
				if(store == n) {
					count++;
				}
			}
			mult = 1;
		}
		
		if(store == (int) Math.pow(i, 2) || store == (int) Math.pow(mult, 2)) {
			prime = false;
		}
		
		else if(count >= 1) {
			prime = false;
		}
		else if(count < 1) {
			prime = true;
		}
		if(n == 2) {
			prime = true;
		}

		return prime;
		//This method should set prime true if n is prime.
		//This method should set prime false if n is composite.
		//This method should return isPrime;
	}
	
	public static int divisorSum(int n) {
		int sum = 0;
		double user1 = (double) n;
		double answer;
		double remainder;
		for(double divisor = 1.00; n >= divisor; divisor = divisor + 1.00) {
			answer = user1 / divisor;
			remainder = user1 % divisor;
			if(divisor == n) {
				break;
			}
			if(remainder == 0) {
				sum = sum + (int) divisor;
			}
			
			
		}
		
		return sum;
	}
	
	public static boolean isStrong(int n) {
		boolean strong = false;
		boolean prime = isPrime(n);
		int divSum = divisorSum(n);
		if(prime == false && divSum < n) {
			strong = true;
		}
		/*
		 A number is considered strong if it is:
		 1) Greater than the sum of its divisors
		 2) A composite number
		 */
		
		/*
		 A number is considered weak if it is:
		 1) Less than the sum of its divisors
		 2) A composite number
		 */
		
		/*
		 * This method should check if n is strong.
		 * The call isStrong(8) should return true because 8 > (1 + 2 + 4) = 7
		 * The call isStrong(12) should return false because 12 < (1 + 2 + 3 + 4 + 6) = 16
		 */
		
		//This method MUST use the divisorSum and isPrime method
		
		return strong;
	}
	
	
	public static void printDivisors(int n) {
		double user1 = (double) n;
		double answer;
		double remainder;
		for(double divisor = 1.00; n >= divisor; divisor = divisor + 1.00) {
			answer = user1 / divisor;
			remainder = user1 % divisor;
			
			if(divisor == n) {
				break;
			}
			if(remainder == 0) {
				System.out.println((int) divisor);
			}
		}
		 /*
		 This method should print the divisors of n (not including n)
		 on a single line.
		 If printDivisors(12) is called, 1 2 3 4 6		should be printed.
		 */
	}
	
	public static void printPrimes(int n) {
		boolean primer;
		int counter = 2;
		while(counter <= n) {
			if(isPrime(counter) == true) {
				if(counter == n) {
					break;
				}
			System.out.println(counter);
		}
			counter++;
		}
		//This method prints all prime numbers less than n on a single line
		//The call printPrimes(30) should print 2 3 5 7 11 13 17 19 23 29
		//This method MUST use the isPrime method
	}
	
	public static void printComposites(int n) {
		boolean primer;
		int counter = 2;
		while(counter <= n) {
			if(isPrime(counter) == false) {
				if(counter == n) {
					break;
				}
			System.out.println(counter);
		}
			counter++;
		}
		//This method prints all composite numbers less than n on a single line
		//The call printComposites(30) should print 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 
		//This method MUST use the isPrime method
	}
	
	public static void printStrong(int n) {
		int counter = 2;
		while(counter <= n) {
			if(isStrong(counter) == true) {
				if(counter == n) {
					break;
				}
				System.out.println(counter);
			}
			counter++;
		}
		//This method prints all the strong numbers less than n on a single line
		//The call printStrong(30) should print 4 8 9 10 14 15 16 21 22
		//This method MUST use the isStrong method
	}
	
	public static void printWeak(int n) {
		int counter = 2;
		while(counter <= n) {
			if(isStrong(counter) == false && isPrime(counter) == false) {
				if(counter == n) {
					break;
				}
				System.out.println(counter);
			}
			counter++;
		}
		
		//This method prints all the weak numbers less than n on a single line
		//The call printWeak(30) should print 6 12 18 20 24 28
		//This method MUST use the isStrong method
	}
	
	public static void main(String[] args) {
		printComposites(30);
		printPrimes(30);
		printStrong(30);
		printWeak(30);
	}

}