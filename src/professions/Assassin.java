package professions;

import decorator.Decorator;
import character.Character;


public class Assassin extends Decorator {
	private Character character;
	public Assassin(Character g){
		character=g;
	}
	public String getRace(){
		return character.getRace();
	}
	public String getRacial(){
		return character.getRacial();
	}
	public String getProfession(){
			return character.getProfession() + "Profession: Assassin\n";
	}
	public String getSkill(){
		return character.getSkill() + "Skills: Sneaking, Poisons, Melee combat\n";
	}
}
