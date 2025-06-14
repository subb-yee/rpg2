package Main;
import Character.*;
import Character.Character;
import Map.*;
import Mission.*;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Character c = new Character();
		Hero h = new Hero();
		
		
		h.lv = 30;
		Warrior w = new Warrior();
		w.t();
		Hero w2 = (Hero)w;
		System.out.print(w2.lv);
		
	}
}
