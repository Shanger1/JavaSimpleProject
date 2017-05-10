package character;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import professions.*;
import races.*;

public class Main {

	public static void main(String[] args) {
		Character character = new Human();
		Assassin assassin = new Assassin(character);
		System.out.println(assassin.getRace() + assassin.getProfession() + assassin.getRacial() + assassin.getSkill());
		
		PrintWriter save;
		try
		{
			save = new PrintWriter("Character.txt");
		    save.println(assassin.getRace());
		    save.println(assassin.getRacial());
		    save.println(assassin.getProfession());
		    save.println(assassin.getSkill());
		    save.close();
		} 
		catch (FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
	}
}
