package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Abteilung;
import ch.zli.m223.punchclock.domain.Parkplatz;
import ch.zli.m223.punchclock.repository.AbteilungRepository;

public class AbteilungService {
    private AbteilungRepository abteilungRepository;

    public static Abteilung createAbteilung(Abteilung abteilung) {
        return abteilung;
    }
}
