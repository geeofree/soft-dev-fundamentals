package lesson1;

public class ControlFlow {

	public static void main(String[] args) {
		for(int i = 0, len = 10;i < len;i++) {
			System.out.println(i);
		}
		
		int i = 10, j = 0;
		while(i >= j) {
			System.out.println(i);
			i--;
		}
	}

}
