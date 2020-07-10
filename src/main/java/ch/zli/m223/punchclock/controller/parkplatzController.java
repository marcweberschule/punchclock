package ch.zli.m223.punchclock.controller;


import ch.zli.m223.punchclock.domain.Parkplatz;
import ch.zli.m223.punchclock.service.ParkplatzService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

public class parkplatzController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Parkplatz createParkplatz(@Valid @RequestBody Parkplatz parkplatz) {
        return ParkplatzService.createParkplatz(parkplatz);
    }
}
