package Character;
import java.util.Scanner;
public class Monster extends Character {
	
	Scanner in = new Scanner(System.in);
	public int power;
	public int def;
	public int money;
	public int exp;
	public int enemy;
	
	
	public int select(int lv) {
		
			
			while(true) {
				System.out.println("1. 너구리\n2. 살쾡이\n3. 들개\n4. 멧돼지");
				System.out.println("전투할 상대를 입력하세요. : ");
				enemy = in.nextInt();
				if(enemy == 1) {
					
					System.out.println("너구리와 전투를 시작합니다.");
					return 1;
					
				}
				
				else if(enemy == 2) {
					if(lv < 5) {
						System.out.println("레벨이 부족합니다.");
						
					}
					else {
						System.out.println("살쾡이와 전투를 시작합니다.");
						return 2;
					}
					
					
				}
				
				else if(enemy == 3) {
					if(lv < 10) {
						System.out.println("레벨이 부족합니다.");
						}
					
					else {
						System.out.println("살쾡이와 전투를 시작합니다.");
						return 3;
					}
					
				}
				
				else if(enemy == 4) {
					if(lv < 15) {
						System.out.println("레벨이 부족합니다.");
						
					}
					else {
						System.out.println("살쾡이와 전투를 시작합니다.");
						return 4;
					}
					
				}
				
				else {
					System.out.println("잘못 입력했습니다.");
				}
		}}		

	
	public int attack() {
		
	}
	public int [] dead(){
		
		
	}
	public int attacked(int[] sum) {
		System.out.println("d");
		return 0;
		
	}
}
