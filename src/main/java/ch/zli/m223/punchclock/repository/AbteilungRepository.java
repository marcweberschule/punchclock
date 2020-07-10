package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Abteilung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbteilungRepository extends JpaRepository<Abteilung, Long> {

}
