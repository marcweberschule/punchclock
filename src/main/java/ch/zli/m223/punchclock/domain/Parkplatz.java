package ch.zli.m223.punchclock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parkplatz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nrSchild;

    private String marke;

    public long getId() {
        return id;
    }

    public int getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(int nrSchild) {
        this.nrSchild = nrSchild;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}
