package pl.awsome.workshops.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//to kocznieczne nie jest, ale czasem się przydaje, że możesz utworzyć obiekt bez paramterów w kostruktroze
@AllArgsConstructor
public class DaneDoZwrocenia {

    private long recursiveQuickSort;//to trzeba zmienic zeby zwracac dane o jakie prosi uzytkownik
    private int countOfelements;
    private String name;

    public long getSortingTime() {
        return recursiveQuickSort;
    }

    public void setSortingTime(long sortingTime) {
        this.recursiveQuickSort = sortingTime;
    }

    public void setCountOfelements(int countOfelements) {
        this.countOfelements = countOfelements;
    }
}

