package pl.awsome.workshops.controller.model;

import lombok.Data;

@Data
public class NoteDTO {//data transfer object,
    private String title;
    private String message;
}
