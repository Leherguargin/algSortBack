package pl.awsome.workshops.controller;

import org.springframework.web.bind.annotation.*;
import pl.awsome.workshops.controller.model.DaneDoSortowaniaDTO;
import pl.awsome.workshops.controller.model.DaneDoZwrocenia;
import pl.awsome.workshops.tools.algorithms.QuickSort;
import pl.awsome.workshops.tools.algorithms.SelectionSort;

import java.util.Random;

@RestController
@RequestMapping(value = "sort")
public class SortController {
    @CrossOrigin(origins = "http://inzml.herokuapp.com")//"http://localhost:3000"
    @PostMapping
     public DaneDoZwrocenia[] getDataToCharts(@RequestBody DaneDoSortowaniaDTO daneDoSortowaniaDTO){
        String[] algorytmy = daneDoSortowaniaDTO.getJakie_algorytmy();

        //tworze algorytmy sortowania... powinny być statyczne?
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();

        //inicjalizacja danych zwracanych
        DaneDoZwrocenia[] daneDoZwrocenia = new DaneDoZwrocenia[(daneDoSortowaniaDTO.getDoIlu()-daneDoSortowaniaDTO.getOdIlu())/daneDoSortowaniaDTO.getCoIle() + 1];
        for(int value = daneDoSortowaniaDTO.getOdIlu(), i = 0; value < daneDoSortowaniaDTO.getDoIlu(); value += daneDoSortowaniaDTO.getCoIle(), i++){
            daneDoZwrocenia[i] = new DaneDoZwrocenia();
            daneDoZwrocenia[i].setX(value);
            //sprawdzamy jakie dane
            switch (daneDoSortowaniaDTO.getJakieDane()){
                case "losowe": {
                    //losujemy tablice z danymi do sortowania
                    int[] tab = generateTableOfRandomInts(value);
                    for(String algorytm : algorytmy){
                        switch(algorytm){
                            case "quickSort": {
                                long czas = System.nanoTime();
                                quickSort.sort(tab);
                                czas = System.nanoTime() - czas;
                                daneDoZwrocenia[i].setQuickSort(czas);
                                break;
                            }

                            case "selectionSort": {
                                long czas = System.nanoTime();
                                selectionSort.sort(tab);
                                czas = System.nanoTime() - czas;
                                daneDoZwrocenia[i].setSelectionSort(czas);
                                break;
                            }
                        }
                    }
                }
                case "wprost":
                {

                }
            }
        }

        return daneDoZwrocenia;
    }

    //zwraca tablice losowych intów (z powtórzeniami) od zera do length
    private int[] generateTableOfRandomInts(int length) {
        int[] arr = new int[length];
        for (int element:arr) {
            Random random = new Random();
            element = random.nextInt(length);
        }
        return arr;
    }

//    private DaneDoZwrocenia[] generateTimes(int odIlu, int doIlu, int coIle, Boolean[] jakieAlgorytmy, String[] dostepneAlgorytmy) {
//
//
//        System.out.println("tablica logiczna " + jakieAlgorytmy);
//
//
//        for(int value = odIlu, i = 0; value < doIlu; value += coIle, i++){
//            int[] arr = generateTableOfRandomInts(value);
//            daneDoZwrocenia[i] = new DaneDoZwrocenia(System.nanoTime(), value, String.valueOf(value));
//            quickSort.sort(arr); //dla zbyt duzych liczb wywala wyjątek java.lang.StackOverflowError: null (12k wywala, 11k nie)
//            daneDoZwrocenia[i].setSortingTime(System.nanoTime()-daneDoZwrocenia[i].getSortingTime());
//            //System.out.println(value + " " + daneDoZwrocenia[i].getSortingTime()*10e-9);
//        }
//
//        return daneDoZwrocenia;
//    }

}
