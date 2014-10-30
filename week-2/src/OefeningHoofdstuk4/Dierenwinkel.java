package OefeningHoofdstuk4;

import java.util.ArrayList;

public class Dierenwinkel {
	ArrayList<Huisdier> lijst = new ArrayList<Huisdier>();
	
	public void voegToe(Huisdier dier)
	{
		lijst.add(dier);
	}	
	
	public void printOverzicht()
	{
		for(Huisdier dier : lijst)
		{
			System.out.println(dier.getNaam());
		}
	}
}
