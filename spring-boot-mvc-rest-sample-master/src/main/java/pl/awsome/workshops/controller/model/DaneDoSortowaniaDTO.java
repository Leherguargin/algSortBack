package pl.awsome.workshops.controller.model;

import lombok.Data;


@Data
public class DaneDoSortowaniaDTO {
    private enum DlaJakichDanych{ losowe, bezPowtorzen, prawiePosortowane, wsteczniePosortowane};

    private Boolean[] jakie_algorytmy; //moze tu tez enum?
    private int odIlu;
    private int doIlu;
    private int coIle;
    private DlaJakichDanych jakieDane;

}
