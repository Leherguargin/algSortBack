package pl.awsome.workshops.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class DaneDoZwrocenia {

    //czas sortowania
    private double quickSort;
    private double selectionSort;

    //ilosc elementow sortowanej tablicy
    private long x;
}

