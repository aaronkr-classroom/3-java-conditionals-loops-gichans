import java.util.Scanner;

public class Ex407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		System.out.println("5개 숫자 입력하세요");
		int num[] = new int[5];
		
		for (int n= 0; n <5; n++) {
			Scanner s = new Scanner(System.in);
					num[n] = s.nextInt();
		
		}
		
		for (int i:num) {
			sum += 1;
		}
		
		System.out.println("합계: "+ sum);

	}

}
