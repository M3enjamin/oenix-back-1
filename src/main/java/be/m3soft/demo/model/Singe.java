package be.m3soft.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Singe {
    private String nom;
    private List<Tour> tours;
    private List<Observateur> observateurs;

    public Singe() {
        this.tours = new ArrayList<>();
        this.observateurs = new ArrayList<>();
    }

    public void ajouterObservateur(Observateur observateur) {
        this.observateurs.add(observateur);
    }

    public void exécuterTour(int index) {
        Tour tour = this.tours.get(index);
        for (Observateur observateur : this.observateurs) {
            observateur.tourExécuté(tour, this);
        }
    }

    public void apprendreTour(Tour tour) {
        this.tours.add(tour);
    }

    public void setTours(Set<Tour> tours2) {
    }

    public String getNom() {
        return nom;
    }

}
