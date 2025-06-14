package Map;

import java.util.Scanner;

public class WeaponStore {
	public int a;
	public int weapon(int money) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. 철퇴 (100원):");
		System.out.println("(기사 전용) 적을 뭉개버립니다. 스매쉬 공격을 사용 가능합니다.");
		System.out.println("2. 라이트닝 완드(100원):");
		System.out.println("(마법사 전용) 주위에 번개가 모여듭니다. 벼락 공격을 사용 가능합니다.");
		System.out.println("3. 바랑의 활(100원):");
		System.out.println("(궁수 전용) 깃털과 같이 가볍습니다. 속사 공격을 사용 가능합니다.");
		a = in.nextInt();
		
		switch(a) {
		case(1):
			if(money < 100) {
				System.out.println("돈이 부족합니다");
				return 0;				
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 100;
				return a;
			}
		case(2):
			if(money < 100) {
				System.out.println("돈이 부족합니다");
				return 0;
			}
			else {
				System.out.println("구매에 성공했습니다.");
				money = money - 100;
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

		default : 
			System.out.println("다시 선택하세요,");
			return 0;
		}
		
	
	}
}
