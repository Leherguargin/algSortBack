package pl.awsome.workshops.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.awsome.workshops.controller.model.NoteDTO;
import pl.awsome.workshops.service.NoteService;
import pl.awsome.workshops.service.model.Note;

@RestController
@RequestMapping(value = "notes")/// localhost:8091/notes
public class NoteController {


    @Autowired
    private NoteService noteService;

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET,produces = "application/json")
    //@ResponseStatus(HttpStatus.CREATED)//status 202
    public List<Note> getNotes () {
        return noteService.getAllNotes();
    }


    @GetMapping(value = "cos")//localhost:8091/notes/cos
    public String getCos(){
        return "NA szybko";
    }

    @PostMapping()
    public void createNote(@RequestBody NoteDTO noteDTO) {
        noteService.saveNote(noteDTO);
    }


    @DeleteMapping()
    public void deleteNote (@RequestParam String noteId) {
        noteService.deleteNote(noteId);
    }

}
