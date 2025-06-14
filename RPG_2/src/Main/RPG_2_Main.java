package Main;
import Character.*;
import Map.*;
import Mission.*;
import java.util.Scanner;
import java.util.Random;

public class RPG_2_Main {
	
	public static void main(String[] args) {
		
		//객체 생성
		Hero h = new Hero();
		Monster m = new Monster();
		Scanner in = new Scanner(System.in);
		Racoon r = new Racoon();
		Dog d = new Dog();
		Cat c = new Cat();
		Boar b = new Boar();
		Map map = new Map();
		Random ran = new Random();
		PotionStore potion = new PotionStore();
		WeaponStore weapon = new WeaponStore();
		Mission mi = new Mission();
		
		//기본 정보 수집
		System.out.print("영웅의 이름을 입력하세요. : ");
		h.name = in.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("당신의 직업을 선택하세요");
		System.out.println("전사");
		System.out.println("마법사");
		System.out.println("궁수");
		h.job = in.next();
		System.out.println("직업이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다. \n*********************");
		
		//직업 판정 
		if(h.job.equals("전사")) {
			h.money = 100;
			h.lv = 1;
			h.exp = 0;
			h.hp = 80;
			h.power = 15;
			h.def = 25;
			h.mp = 0;
			
		}
		
		else if(h.job.equals("마법사")) {
			h.money = 0;
			h.lv = 1;
			h.exp = 0;
			h.hp = 60;
			h.power = 10;
			h.def = 20;
			h.mp = 100;
								
		}
		else if(h.job.equals("궁수")) {
			h.money = 0;
			h.lv = 1;
			h.exp = 0;
			h.hp = 50;
			h.power = 30;
			h.def = 15;
			h.mp = 0;
						
		}
		
		while(true) {//메인 프로세스 
			
			h.lvup();//레벨업 판정
			
			h.info();//유저 정보 출력
			
			map.selectmap();//행선지 결정
			
			if(map.place == 1) {//행선지 판단 및 프로세스 실행-사냥터
				
				switch(m.select(h.lv)){//적 선택과 업캐스팅 진행
				case 1 : m = new Racoon(); break;
				case 2 : m = new Cat(); break;
				case 3 : m = new Dog(); break;
				case 4 : m = new Boar(); break;
				}
				
				
				if(h.job.equals("전사")) {//전사 전투 프로세스
					Warrior hj = new Warrior();	
					
					while(true) {
						int p;
						p = m.attacked(hj.attackin(h.lv, h.power, h.wea, h.mp));
						if(p == 1) {
							h.exp += m.dead()[1];
							h.money += m.dead()[0];
							if(ran.nextInt(4)+1 == 5) {
								h.exp += m.dead()[1];
								h.money += m.dead()[0];
							}
							break;
						}
						p = h.attacked(m.attack());
						if(p == 1) {
							break;
						}
					}
					continue;
					
				}
				else if(h.job.equals("마법사")){//전사 전투 프로세스
					Sorcerer hj = new Sorcerer();	
					while(true) {
						int p;
						p = m.attacked(hj.attackin(h.lv, h.power, h.wea, h.mp));
						if(p == 1) {
							
							h.exp += m.dead()[1];
							h.money += m.dead()[0];
							if(ran.nextInt(4)+1 == 5) {
								h.exp += m.dead()[1];
								h.money += m.dead()[0];
							}
							break;
						}
						p = h.attacked(m.attack());
						if(p == 1) {
							break;
						}
					}
					
					continue;
					
				}
				else if(h.job.equals("궁수")){//전사 전투 프로세스
					Archer hj = new Archer();	
					while(true) {
						int p;
						p = m.attacked(hj.attackin(h.lv, h.power, h.wea, h.mp));
						if(p == 1) {
							
							h.exp += m.dead()[1];
							h.money += m.dead()[0];
							if(ran.nextInt(4)+1 == 5) {
								h.exp += m.dead()[1];
								h.money += m.dead()[0];
							}
							break;
						}
						p = h.attacked(m.attack());
						if(p == 1) {
							break;
						}
					}
					
					continue;
					
				}
			}
			
			else if(map.place == 2) {//행선지 판단 및 프로세스 실행-포션 상점
				h.usepotion(potion.potion(h.money));
			}
			
			else if(map.place == 3) {//행선지 판단 및 프로세스 실행-무기 상점
				h.useweapon(weapon.weapon(h.money), h.job);
			}
			
			else if(map.place == 4) {//행선지 판단 및 프로세스 실행-미션 수행
				h.money += mi.ran(h.lv);
			}
			
			
		}
		
			
			
		}}	
			

		
	

