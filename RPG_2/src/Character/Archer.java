package Character;
import java.util.Scanner;
public class Archer extends Hero {
	Scanner in = new Scanner(System.in);
	public int [] attackin(int lv, int power, int wea, int mp) {
		while(true) {
			System.out.println("1. 발사\n2. 정조준\n3. 속사");
			System.out.println("공격 번호를 입력하세요 :");
			int atc = in.nextInt();
			
			if(atc == 1) {
				int sum = lv*10+power*30;
				return new int[] {sum, 0};
			}
			
			else if(atc == 2) {
				if(lv < 5) {
					System.out.println("레벨이 부족합니다.");
					continue;
				}
				else {
					int sum = lv*15+power*35;
					return new int[] {sum, 0};
				}				
			}
			
			
			else if(atc == 3) {
				if(wea == 0) {
					System.out.println("바람의 활을 구입 후 다시 시도하세요.");
				}
				
				else if(wea == 1) {
					int sum = lv*10+power*60;
					return new int[] {sum, 3};
				}
			}
			
			
			else {
				System.out.println("다시 입력하세요.");
				}
			
		}	
	}
	
	public void attacked(int sum) {
		
	}
	
}
