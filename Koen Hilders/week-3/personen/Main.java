package personen;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import personen.Persoon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Persoon> personenlijst = new ArrayList<Persoon>();
		personenlijst.add( new Persoon("Koen", "Hilders") );
		personenlijst.add( new Persoon("Sjors", "Hilders") );
		personenlijst.add( new Persoon("Ad", "Hilders") );
		personenlijst.add( new Persoon("Jolande", "Hilders") );
		personenlijst.add( new Persoon("Henk", "Jansen") );
		
		
		String filenaam = "C:\\Users\\koen_relax\\Desktop\\object.txt";
		 try {
		   ObjectOutputStream uit =
		     new ObjectOutputStream(
		       new FileOutputStream( filenaam ) );
		   uit.writeObject( personenlijst );
		   uit.close();
		   System.out.println("Het schrijven van het bestand is gelukt");
		 }
		 catch( IOException e ) {
		   System.out.println("Mislukt ):");
		 }
		 
			String fn = "C:\\Users\\koen_relax\\Desktop\\text.txt";
			try {
				PrintWriter uit = new PrintWriter(new BufferedWriter(new FileWriter(fn)));
				for(Persoon persoon : personenlijst){
					uit.println(persoon.toString());
				}
				uit.close();
				System.out.println("Het schrijven van het bestand is gelukt");
			}
			catch(IOException e){
				System.out.println("Mislukt ):");
			}
	}
}