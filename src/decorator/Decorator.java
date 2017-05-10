package decorator;

import character.Character;

public abstract class Decorator extends Character{
	public abstract String getRace();
	public abstract String getProfession();
	public abstract String getRacial();
	public abstract String getSkill();
}
