package pl.awsome.workshops.service.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Note {

    private String id;
    private String title;
    private String message;
    private LocalDateTime createDate;
}
