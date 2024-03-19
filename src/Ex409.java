
public class Ex409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
				if ( i == 3 && j == 2) {
					System.out.println("루프를 다시 할게");
					continue;
				} else if ( i == 4 && j == 1 ) {
					System.out.println("루프를 종료 할게");
					break;
				}
				
				System.out.println("i: " + i + " j:" + j); 
			}
		}

	}

}
