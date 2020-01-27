package pl.awsome.workshops.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.awsome.workshops.controller.model.NoteDTO;
import pl.awsome.workshops.repository.NoteRepository;
import pl.awsome.workshops.service.model.Note;

@Service//możemy spróbować bazkę
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public void saveNote(NoteDTO noteDTO) {
        Note note = new Note();
        note.setTitle(noteDTO.getTitle());
        note.setMessage(noteDTO.getMessage());
        note.setId(UUID.randomUUID().toString());//generuje prawdziwie unkatowe id
        note.setCreateDate(LocalDateTime.now());
        noteRepository.saveNote(note);
    }

    public void deleteNote(String noteId) {
        noteRepository.deleteNote(noteId);
    }

   public List<Note> getAllNotes() {
       return new ArrayList<>(noteRepository.getNotes());
   }

}
