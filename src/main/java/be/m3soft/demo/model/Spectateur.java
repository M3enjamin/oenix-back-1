package be.m3soft.demo.model;

public class Spectateur implements Observateur {

    @Override
    public void tourExécuté(Tour tour, Singe singe) {
        if (tour.getType() == TypeTour.ACROBATIE) {
            System.out.println("spectateur applaudit pendant le tour d'acrobatie '" + tour.getNom() + "' du singe '"
                    + singe.getNom() + "'");
        } else {
            System.out.println("spectateur siffle pendant le tour de musique '" + tour.getNom() + "' du singe '"
                    + singe.getNom() + "'");
        }
    }

}
