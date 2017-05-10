package professions;

import decorator.Decorator;
import character.Character;

public class Armourer extends Decorator {
	private Character character;
	public Armourer(Character g){
		character=g;
	}
	public String getRace(){
		return character.getRace();
	}
	public String getRacial(){
		return character.getRacial();
	}
	public String getProfession(){
		return character.getProfession() + "Profession: Armourer\n";
	}
	public String getSkill(){
		return character.getSkill() + "Skill: Equipment repair";
	}
}
