package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {
    private EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    //Alle einträge werden hier geholt und am service weitergegeben
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();
    }
    //Ein neuer Eintrag kann hier erstellt werden und wird am service weitergegeben
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }
    //Ein bereits bestehender Eintrag wird durch die id Gelöscht, die Id wird an den service weitergegeben
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEntry(@PathVariable long id) { entryService.deleteEntry(id); }
    //Ein bereits bestehender Eintrag wird durch die id editiert, die Id wird an den service weitergegeben
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Entry editEntry(@Valid @RequestBody Entry entry) { return entryService.editEntry(entry); }
}
