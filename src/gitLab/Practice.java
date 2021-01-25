package gitLab;

public class Practice {
	/**
	 * 
	 * @param a The first age parameter
	 * @param b The second age parameter
	 * @param c The third age parameter
	 * @return The sum adjusted by the fixTeen() method
	 */
	public int noTeenSum(int a, int b, int c) {
		int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
		return sum;
	}
	/**
	 * 
	 * @param n input value to be adjusted
	 * @return Adjusted value for use in noTeemSum() method. Sets all values between 13 and 19, inclusive, excluding 15 and 16, to zero.
	 */
	public int fixTeen(int n){
		int rtnVal = n;
		if(n >= 13 && n <= 19){
		  if(!(n == 15 || n == 16)){
		    rtnVal = 0;
		  }
		}
		return rtnVal;
	}
}
