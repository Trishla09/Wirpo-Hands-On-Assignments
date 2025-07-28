package Flow_Control_Structure;

public class PrimeNumbers {
	public static boolean isPrime(int i) {
		boolean flag=true;
		if(i<=1)
			flag=false;
		else {
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		}
		return flag;
	}

	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			if(isPrime(i))
				System.out.println(i);
			
		}

	}

}
