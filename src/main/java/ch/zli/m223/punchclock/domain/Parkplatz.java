package ch.zli.m223.punchclock.domain;

import org.springframework.transaction.support.AbstractPlatformTransactionManager;

import javax.persistence.*;

@Entity
public class Parkplatz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int parkplatzNr;

    private String marke;

    @ManyToOne
    private ApplicationUser user;

    public long getId() {
        return id;
    }

    public int getParkplatzNr() {
        return parkplatzNr;
    }

    public void setParkplatzNr(int parkplatzNr) {
        this.parkplatzNr = parkplatzNr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public ApplicationUser getUser() { return user;}

    public void setUser(ApplicationUser user) { this.user = user;}
}
