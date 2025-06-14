package Character;

public class Boar extends Monster {
	String name = "멧돼지";
	int hp = 3000;
	int mp = 0;
	int lv = 15;
	int power = 200;
	int def = 30;
	int money = 100;
	int exp = 150;
	
	
	public int attack() {
		System.out.println("멧돼지의 공격입니다.");
		return this.power;
	}
	
	public int attacked(int[] sum) {
		if(sum[1] == 2) {
			System.out.println("치명타!");
			sum[0] = sum[0]*2;
		}
		if(this.def >= sum[0]) {
			System.out.println("데미지는 0 입니다.");
			return 0;
		}
		else {
			
			if(sum[0] - this.def >= this.hp) {
				System.out.printf("%s가 죽었습니다.\n",this.name);
				
				this.hp = 0;
				return 1;
			}
			else {
				this.hp = this.hp + this.def - sum[0];
				System.out.printf("데미지는 %d 입니다.\n",sum[0]-this.def);
				return 0;
			}
	}
	
}
	public int [] dead(){
		return new int[] {this.money, this.exp};
		
	}
}
