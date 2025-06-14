package Map;
import java.util.Scanner;
public class PotionStore {

	public int a;
	public int potion(int money) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. 힘 증강 포션 (30원)");
		System.out.println("2. 방어력 증강 포션 (30원)");
		System.out.println("3. 경험치 증강 포션 (100원)");
		System.out.println("4. HP 증강 포션 (10원)");
		System.out.println("5. MP 증강 포션 (10원)");
		System.out.println("원하시는 물건을 입력하세요 :");
		a = in.nextInt();
		
		switch(a) {
		case(1):
			if(money < 30) {
				System.out.println("돈이 부족합니다");
				return 0;				
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 30;
				return a;
			}
		case(2):
			if(money < 30) {
				System.out.println("돈이 부족합니다");
				return 0;
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 30;
				return a;
			}
		case(3):
			if(money < 100) {
				System.out.println("돈이 부족합니다");
				return 0;
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 100;
				return a;
			}
		case(4):
			if(money < 10) {
				System.out.println("돈이 부족합니다");
				return 0;
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 10;
				return a;
			}
		case(5):
			if(money < 10) {
				System.out.println("돈이 부족합니다");
				return 0;
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 10;
				return a;
			}
		default : 
			System.out.println("다시 선택하세요,");
			return 0;
		}
		
	
	}
	

}

