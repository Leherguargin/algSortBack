package pl.awsome.workshops.controller;

import org.springframework.web.bind.annotation.*;
import pl.awsome.workshops.controller.model.DaneDoSortowaniaDTO;
import pl.awsome.workshops.controller.model.DaneDoZwrocenia;
import pl.awsome.workshops.tools.algorithms.QuickSort;

import java.util.Random;

@RestController
@RequestMapping(value = "sort")
public class SortController {

    @CrossOrigin(origins = "http://localhost:3000")//"http://inzml.herokuapp.com"
    @PostMapping(value = "quick-sort")  //
    public DaneDoZwrocenia[] sortQuickSort(@RequestBody DaneDoSortowaniaDTO daneDoSortowaniaDTO){
        System.out.println(daneDoSortowaniaDTO);
        return generateTimes(daneDoSortowaniaDTO.getOdIlu(), daneDoSortowaniaDTO.getDoIlu(), daneDoSortowaniaDTO.getCoIle(), daneDoSortowaniaDTO.getJakie_algorytmy());
    }

    private int[] generateTableOfRandomInts(int length) { //zwraca tablice losowych intów (z powtórzeniami) od zera do length
        int[] arr = new int[length];
        for (int element:arr) {
            Random random = new Random();
            element = random.nextInt(length);
        }
        return arr;
    }

    private DaneDoZwrocenia[] generateTimes(int odIlu, int doIlu, int coIle, Boolean[] jakieAlgorytmy) { //zmienic nazwe, dodac wybór algorytmu sortowania tak by było można dodawać łatwo kolejne(moze enum? lambda?)
        DaneDoZwrocenia[] daneDoZwrocenia = new DaneDoZwrocenia[(doIlu-odIlu)/coIle + 1];

        QuickSort quickSort = new QuickSort();
        for(int value = odIlu, i = 0; value < doIlu; value += coIle, i++){
            int[] arr = generateTableOfRandomInts(value);
            daneDoZwrocenia[i] = new DaneDoZwrocenia(System.nanoTime(), value);
            quickSort.sort(arr); //dla zbyt duzych liczb wywala wyjątek java.lang.StackOverflowError: null (12k wywala, 11k nie)
            daneDoZwrocenia[i].setSortingTime(System.nanoTime()-daneDoZwrocenia[i].getSortingTime());
            System.out.println(value + " " + daneDoZwrocenia[i].getSortingTime()*10e-9);
        }

        return daneDoZwrocenia;
    }

}
