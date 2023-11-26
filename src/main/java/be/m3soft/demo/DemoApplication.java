package be.m3soft.demo;

import java.util.Set;

import be.m3soft.demo.model.Dresseur;
import be.m3soft.demo.model.Singe;
import be.m3soft.demo.model.Spectateur;
import be.m3soft.demo.model.Tour;
import be.m3soft.demo.model.TypeTour;

public class DemoApplication {

	public static void main(String[] args) {
		Spectateur spectateur = new Spectateur();

		Dresseur dresseur1 = new Dresseur(Set.of(new Tour("Tour1", TypeTour.MUSIQUE),
				new Tour("Tour2", TypeTour.ACROBATIE), new Tour("Tour3", TypeTour.MUSIQUE)));
		Dresseur dresseur2 = new Dresseur(Set.of(new Tour("Tour1", TypeTour.ACROBATIE),
				new Tour("Tour2", TypeTour.ACROBATIE), new Tour("Tour3", TypeTour.MUSIQUE),
				new Tour("Tour4", TypeTour.ACROBATIE)));

		Singe singe1 = new Singe();
		singe1.ajouterObservateur(spectateur);
		Singe singe2 = new Singe();
		singe2.ajouterObservateur(spectateur);

		dresseur1.setSinge(singe1);
		dresseur2.setSinge(singe2);

		dresseur1.faireExécuterTours();
		dresseur2.faireExécuterTours();

	}

}
