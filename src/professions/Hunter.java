package professions;

import decorator.Decorator;
import character.Character;


public class Hunter extends Decorator {
	private Character character;
	public Hunter(Character g){
		character=g;
	}
	public String getRace(){
		return character.getRace();
	}
	public String getRacial(){
		return character.getRacial();
	}
	public String getProfession(){
		return character.getProfession() + "Profession: Hunter\n";
	}
	public String getSkill(){
		return character.getSkill() + "Skills: Sneaking, Archery\n";
	}
}
