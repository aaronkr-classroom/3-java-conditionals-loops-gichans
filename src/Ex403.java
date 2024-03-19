import java.util.Scanner;

public class Ex403 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();

		if (grade >= 90) {
			System.out.println("A 당신은 천재다");
		} else if (grade >= 80) {
			System.out.println("B 괜찮아");
		} else if (grade >= 70) {
			System.out.println("C 어차피 졸업할 수 있겠네");
		} else if (grade >= 60) {
			System.out.println("D 게임 많이 했지");
		} else {
			System.out.println("F ㅠㅠ");
		}
	}

}
