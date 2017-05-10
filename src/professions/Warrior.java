package professions;

import decorator.Decorator;
import character.Character;

public class Warrior extends Decorator {
	private Character character;
	public Warrior(Character g){
		character=g;
	}
	public String getRace(){
		return character.getRace();
	}
	public String getRacial(){
		return character.getRacial();
	}
	public String getProfession(){
		return character.getProfession() + "Profession: Warrior\n";
	}
	public String getSkill(){
		return character.getSkill() + "Skills: Melee combat, Attacks using sword, Attacks using axe, Attacks using spear";
	}
}