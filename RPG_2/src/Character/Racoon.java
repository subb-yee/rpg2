package Character;

public class Racoon extends Monster {
	String name = "너구리";
	int hp = 100;
	int mp = 0;
	int lv = 1;
	int power = 20;
	int def = 5;
	int money = 10;
	int exp = 10;
	
	public int attack() {
		System.out.println("너구리의 공격입니다.");
		return this.power;
	}
	
	public int attacked(int[] sum) {
		
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
