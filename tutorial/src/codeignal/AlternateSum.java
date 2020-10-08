package codeignal;

public class AlternateSum {
	int[] evenOddSums(int[] a) {
		int[] result = new int[2];
		for (int i = 0; i < a.length; i++) {
			result[a[i]%2]+=a[i];
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlternateSum obj1 = new AlternateSum();
		int[] a = {50, 25, 60, 40, 37,33,46};
		
		int[] b = obj1.evenOddSums(a);
		System.out.println(b[0]);
		System.out.println(b[1]);

	}

}
