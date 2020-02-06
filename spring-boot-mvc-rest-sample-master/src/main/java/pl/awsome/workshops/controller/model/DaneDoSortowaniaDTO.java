package pl.awsome.workshops.controller.model;

import lombok.Data;


@Data
public class DaneDoSortowaniaDTO {
    private enum DlaJakichDanych{ losowe, bezPowtorzen, prawiePosortowane, wsteczniePosortowane};
    //private enum JakieAlgorytmy{bubbleSort, bubbleFlag, recursiveQuickSort, iterativeQuickSort}; //lista wszysktich mozliwych

    private Boolean[] jakie_algorytmy;
    private int odIlu;
    private int doIlu;
    private int coIle;
    private DlaJakichDanych jakieDane;



}
