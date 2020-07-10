package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Abteilung;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

public class AbteilungController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Abteilung createAbteilung(@Valid @RequestBody Abteilung abteilung) {
        return Abteilung.createAbteilung(abteilung);
    }
}
