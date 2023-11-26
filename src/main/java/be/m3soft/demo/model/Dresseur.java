package be.m3soft.demo.model;

import java.util.Set;

public class Dresseur {
    private Set<Tour> tours;
    private Singe singe;

    public Dresseur(Set<Tour> tours) {
        this.tours = tours;
    }

    public void faireExécuterTours() {
        for (int i = 0; i < this.tours.size(); i++) {
            this.singe.exécuterTour(i);
        }
    }

    public void setSinge(Singe singe) {
        this.singe = singe;
        this.singe.setTours(this.tours);
    }

}
