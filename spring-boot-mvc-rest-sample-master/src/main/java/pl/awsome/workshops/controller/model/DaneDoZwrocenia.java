package pl.awsome.workshops.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//to kocznieczne nie jest, ale czasem się przydaje, że możesz utworzyć obiekt bez paramterów w kostruktroze
@AllArgsConstructor
public class DaneDoZwrocenia {

    private long[] times;
    private int[] countOfelements;

}

