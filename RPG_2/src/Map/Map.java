package Map;
import java.util.Scanner;
public class Map {

	public int place = 0;
	public int b = 0;
	
	public void selectmap() {
		place = 0;
		this.b = 0;
		Scanner in = new Scanner(System.in);
		
		while(b == 0) {
			System.out.print("1. 사냥터\n2. 포션 상점\n3. 무기 상점\n4. 미션 수행\n입장할 장소를 입력하세요. : ");
			place = in.nextInt();
			
			if(place == 1) {
				System.out.println("사냥터에 입장하였습니다.");
				this.b = 1;
			}
			
			else if(place == 2) {
				System.out.println("포션 상점에 입장하였습니다.");
				this.b = 1;
			}
				
			else if(place == 3) {
				System.out.println("무기 상점에 입장하였습니다");
				this.b = 1;
			}
			
			else if(place == 4) {
				System.out.println("미션 수행 장소에 도착했습니다.");
				this.b = 1;
			}
			else {
					System.out.println("다시 입력하세요.");
					
					
			}
			
		}
	}
}
