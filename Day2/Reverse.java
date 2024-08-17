package Programs.Day2;

public class Reverse {
	
	public static void main(String[] args) {
	
			
			System.out.println(rev(6814));
		}
		

	static int rev(int n) {
		int revNum = 0;
		for (int i=0;n%10>0;i++) {
			
			revNum = revNum*10 + n%10;
			n = n/10;
		}
		return revNum;
		
	}

	}
