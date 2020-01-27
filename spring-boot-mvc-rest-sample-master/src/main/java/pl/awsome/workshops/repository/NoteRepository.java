package pl.awsome.workshops.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;
import pl.awsome.workshops.service.model.Note;

@Repository
public class NoteRepository {

    private ConcurrentHashMap<String,Note> repo = new ConcurrentHashMap<>();//concurrenthashmap do przetwarzznia watkowego

    public void saveNote(Note note) {
        repo.put(note.getId(), note);
    }

    public void deleteNote(String noteId) {
       repo.remove(noteId);
    }

    public Collection<Note> getNotes() {
        return repo.values();
    }
}
