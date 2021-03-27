package projet;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Personne {
	
	//-------------- Attributs --------------\\
	
	String Nom;
	String Prenom;
	int [] NumeroID;
	String sexe;
	//AfficherDate;
	String EtatCivil;
	int MariageID;
	int NbEnfants;
	
	//-------------- Constructeur --------------\\
	
	public void personne () {
		//Creation d'une nouvelle personne
		
		
	}

	//-------------- Methods --------------\\
	
	public void creationPersonne() {
		//Définir les attributs de la personne
		Scanner lecteur = new Scanner(System.in);
		System.out.println("Nom: ");
		Nom = lecteur.next();
		System.out.println("Prenom: ");
		Prenom = lecteur.next();
		System.out.println("ID (5 chiffres): ");
		
		//NumeroID
		Random random = new Random();
		int [] chiffre = new int[5];
		chiffre[0]= random.nextInt(10);
		chiffre[1]= random.nextInt(10);
		chiffre[2]= random.nextInt(10);
		chiffre[3]= random.nextInt(10);
		chiffre[4]= random.nextInt(10);
		for(int i=0; i <=4;i++) {
			System.out.print(chiffre[i]);
		}

		System.out.println(chiffre);
		NumeroID = chiffre;
		
		System.out.println("\nSexe: ");
		sexe = lecteur.next();
		System.out.println("EtatCivil (Marié / Divorcé / Célibataire / Veuf / Alien: ");
		
		EtatCivil = lecteur.next();
		while(conditionEtatCivil(EtatCivil) == false) {
			EtatCivil = lecteur.next();
		}
		
		System.out.println("IdMariage (0 si non marié): ");
		MariageID = lecteur.nextInt();
		System.out.println("Nombre d'enfants: ");
		NbEnfants = lecteur.nextInt();
	}
	
	private boolean conditionID() {
		
		return false;
	}
	
	private void conditionMariage() {
		//verifier si les 2 personnes sont bien mariées
		
	}
	
	
	private void conditionAge() {
		//verifier l'age pour automatiquement mettre l'EtatCivil mineur ou demander l'Etat Civil
		
	}
	
	
	public void EtatPersonne() {
		//Rechercher la fiche d'une personne en entrant son numeroID
		
	}
	
	
	public boolean conditionEtatCivil(String EtatCivil) {
		
		boolean test = false;
		String marie = new String("Marié");
		String celib = new String("Célibataire");
		String alien = new String("Alien");
		String veuf = new String("Veuf");
		String divorce = new String("Divorcé");
		
		while(test==false) {
			if (EtatCivil.equals(marie) || EtatCivil.equals(celib) || EtatCivil.equals(alien) || EtatCivil.equals(veuf) || EtatCivil.equals(divorce)) {
				test = true;
			}else {
				System.out.println("Erreur : Vérifiez l'orthogrphe \nVous ne pouvez rentrer que : Marié / Divorcé / Célibataire / Veuf / Alien ");
				return false;
			}
		}
		return true;
		
		
	}
	
	public void ListePersonne() {
		//afficher la liste des personnes vivantes
	}
	
}