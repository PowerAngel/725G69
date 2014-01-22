import java.util.ArrayList;
import java.util.Random;

public class Main 
{
	public static void main (String[] args){
		ArrayList <Hund> Hundar = new ArrayList <Hund>();
		
		Random slump = new Random();
		int varde = slump.nextInt(20) + 1;
		for(int i = 0; i < varde; i++){

			String gender = setGender();
			Hund hund = new Hund(gender, "Voff");
			System.out.println(hund);
			Hundar.add(hund);
			
		}
		
		for(int i = 0; i < Hundar.size(); i++)
		{
			System.out.println(Hundar.get(i));
		}
	}
	public static String setGender()
	{
		Random rand = new Random();
		int value = rand.nextInt(2); 
		String gender = "";
		if(value == 0)
		{
			gender = "Male";
		}
		else if (value == 1)
		{
			gender = "Female";
		}
		return gender;
	
	}
}