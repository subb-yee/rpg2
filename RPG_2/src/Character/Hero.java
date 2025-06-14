package Character;

public class Hero extends Character {
	
	
	public int power;
	public int def;
	public int money = 0;
	public int exp = 0;
	public int wea = 0;
	
	public int attack() {
		
	}
	
	public int attacked(int sum) {
		
		if(sum >= hp + def) {
			System.out.println("당신은 죽었습니다");
			System.exit(0);
			return 1;
		
		}
		
		else if(sum <= def) {
			System.out.println("데미지는 0 입니다.");
			return 0;
		}
		
		else {
			System.out.printf("데미지는 %d 입니다\n", sum-def);
			hp -= sum - def;
			System.out.printf("현재 체력은 %d 입니다\n", hp);
			return 0;
		}
		
	}
	
	public void info() {
	System.out.printf("현재 %s의 이름 : %s \n",name,name);
	System.out.printf("현재 %s의 레벨 : %d \n",name,lv);
	System.out.printf("현재 %s의 힘 : %d \n",this.name,this.power);
	System.out.printf("현재 %s의 방어력 : %d\n",this.name,this.def);
	System.out.printf("현재 %s의 HP : %d \n",this.name,this.hp);
	System.out.printf("현재 %s의 MP : %d \n",this.name,this.mp);
	System.out.printf("현재 %s의 경험치 : %d \n",this.name,this.exp);
	System.out.printf("현재 %s의 돈 : %d \n",this.name,this.money);
	System.out.printf("현재 %s의 직업 : %s \n",this.name,this.job);
	System.out.println("*********************");	
	
	}
	
	public void lvup() {
	if(this.exp >= this.lv*80) { //레벨업 판정
		this.exp = this.exp - this.lv*80;
		this.lv = this.lv + 1;
		System.out.printf("%s의 레벨이 %d이 되었습니다.",this.name, this.lv);
		this.money += this.lv*50;
		
		System.out.printf("레벨업 기념으로 돈이 %d원 증가하여\n%d원이 되었습니다\n"
				,this.lv*50, this.money);
	}}

	public void usepotion(int num) {
		
		switch (num) {
		
		case 0 : {
			System.out.println("돈이 부족하거나 잘못 입력했습니다.");
			break;
		
		}
				
		case 1 : {
			this.power += 3;
			this.money -= 30;
			break;
		}

		case 2 : {
			this.def += 50;
			this.money -= 30;
			break;
		}
		
		case 3 : {
			this.exp += 100;
			this.money -= 100;
			break;
		}
		
		case 4 : {
			this.hp += 50;
			this.money -= 10;
			break;
		}
		
		case 5 : {
			this.mp += 100;
			this.money -= 10;
			break;
		}
		
		
		
		}
	}

	public void useweapon(int num, String job) {
		switch (num) {
		
		case 0 : {
			System.out.println("돈이 부족하거나 잘못 입력했습니다.");
			break;		
		}
				
		case 1 : {
			if(job.equals("전사")) {
				System.out.println("철퇴를 장착했습니다.");
				this.money -= 100;
				this.wea = 1;
				break;
			}
			
			else {
				System.out.println("잘못된 무기를 구매했습니다. 돈만 잃었습니다.");
				this.money -= 100;
				break;
			}
			
			}
		
		case 2 : {
			if(job.equals("마법사")) {
				System.out.println("라이트닝 완드를 장착했습니다.");
				this.money -= 100;
				this.wea = 1;
				break;
			}
			
			else {
				System.out.println("잘못된 무기를 구매했습니다. 돈만 잃었습니다.");
				this.money -= 100;
				break;
			}
			
			}
		
		case 3 : {
			if(job.equals("궁수")) {
				System.out.println("바람의 활을 장착했습니다.");
				this.money -= 100;
				this.wea = 1;
				break;
			}
			
			else {
				System.out.println("잘못된 무기를 구매했습니다. 돈만 잃었습니다.");
				this.money -= 100;
				break;
			}
			
			}
			
		}
		
		
}
	




}
