package pl.awsome.workshops.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//to kocznieczne nie jest, ale czasem się przydaje, że możesz utworzyć obiekt bez paramterów w kostruktroze
@AllArgsConstructor
public class DaneDoZwrocenia {

    private long sortingTime;
    private int countOfelements;

    public long getSortingTime() {
        return sortingTime;
    }

    public void setSortingTime(long sortingTime) {
        this.sortingTime = sortingTime;
    }

    public void setCountOfelements(int countOfelements) {
        this.countOfelements = countOfelements;
    }
}

