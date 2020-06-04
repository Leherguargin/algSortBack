package pl.awsome.workshops.controller.model;

import lombok.Data;


@Data
public class DaneDoSortowaniaDTO {
    //private enum DlaJakichDanych{ losowe, bezPowtorzen, prawiePosortowane, wsteczniePosortowane};

    private String[] jakie_algorytmy;
    private int odIlu;
    private int doIlu;
    private int coIle;
    private String jakieDane;



}
