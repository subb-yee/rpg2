package Character;

public class Dog extends Monster {
	String name = "들개";
	int hp = 2000;
	int mp = 0;
	int lv = 10;
	int power = 120;
	int def = 25;
	int money = 80;
	int exp = 100;
	
	public int attack() {
		System.out.println("들개의 공격입니다.");
		return this.power;
	}
	
	public int attacked(int[] sum) {
		
		if(sum[1] == 1) {
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
