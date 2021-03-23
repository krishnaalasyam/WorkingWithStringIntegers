/**
 * 
 */
package com.java;

/**
 * @author krishnaveni Java implementation to reverse bits of a number
 */
public class BinaryReversal {

	// function to reverse bits of a number
	public static int reverseBits(int n, int dig) {
		int rev = 0;

		// traversing bits of 'n'
		// from the right
		while (n > 0) {
			// bitwise left shift
			// 'rev' by 1
			rev <<= 1;

			// if current bit is '1'
			if ((int) (n & 1) == 1)
				rev ^= 1;

			// bitwise right shift
			// 'n' by 1
			n >>= 1;
		}
	
		rev <<= 2; // left shift by 2 to add trailing zeros
				  
		// required number
		return rev;
	}

	// Driver code
	public static void main(String[] args) {
		int n = 47;
		System.out.println("Given input integer: "+n);
		System.out.println("Reverse integer: "+reverseBits(n, 8));
	}
}
