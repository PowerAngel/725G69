import java.util.*;
public class Hund extends Djur{
	

	
	private String Gender;
	private String Sound;
	private int Bones = 0;
	public Hund()
	{
	}
	
	public Hund( String gender, String sound)
	{
		super(gender, sound);		
	}
	
	public int getBones()
	{
		return Bones;
	}
	public void setBones(int bones)
	{
		Bones = bones;
	}
	
	public String toString()
	{
		String total = "Gender: " + getGender() + " Sound: " + getSound() + " Bones: " + getBones();
		return total;
	}
	

	/*
	 Hund
	Kön (String): Hane/Hona (Tik/x?)
	Läte (String): ”Voff”
	Jagar (Objekt(?)): Katter, fåglar som inte kan flyga
	Antal ben (int):
	 */

}