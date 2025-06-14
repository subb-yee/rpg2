package Map;
import java.util.Scanner;
import java.util.Random;
public class Mission {
	Scanner in = new Scanner(System.in);
	Random ra = new Random();
	public int ran(int lv) {
		if(lv<5) {
			System.out.println("레벨이 너무 낮아 다음에 다시 와~");
			return 0;
		}
		
		int w = ra.nextInt(2)+1;
		System.out.println("1~3중에 내가 생각하는 수는 뭘까?");
		int an = in.nextInt();
		if(w == an) {
			System.out.println("정답이야 100원을 줄게.");
			return 100;
		}
		else {
			System.out.println("오답이야 다음에 다시 도전해봐~");
			return 0;
		}
	}
}
