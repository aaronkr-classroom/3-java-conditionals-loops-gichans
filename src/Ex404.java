import java.util.Scanner;

public class Ex404 {

	public static void main(String[] args) {
		System.out.print("당신 나이가 뭐에요?");
		System.out.print("\n당신의 키가 몇 센티인가요?");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int height = s.nextInt();
		
		if (age > 15) {
			if (height > 140) {
				System.out.println("티익스프레스 탑승 가능");
				
			} else {
				System.out.println("키 때문에 불가능합니다.");
				
			}
		} else {
			System.out.println("나이 때문에 안됩니다.");
		}
	}

}
