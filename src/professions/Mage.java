package professions;

import decorator.Decorator;
import character.Character;

public class Mage extends Decorator {
	private Character character;
	public Mage(Character g){
		character=g;
	}
	public String getRace(){
		return character.getRace();
	}
	public String getRacial(){
		return character.getRacial();
	}
	public String getProfession(){
		return character.getProfession() + "Profession: Mage\n";	
	}
	public String getSkill(){
		return character.getSkill() + "Skills: Spell casting, Brewing potions\n";
	}
}
