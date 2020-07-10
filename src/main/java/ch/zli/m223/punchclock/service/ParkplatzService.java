package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Parkplatz;
import ch.zli.m223.punchclock.repository.ParkplatzRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkplatzService {
    private ParkplatzRepository parkplatzRepository;

    public static Parkplatz createParkplatz(Parkplatz parkplatz) {
        return parkplatz;
    }

}
