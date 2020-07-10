package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Abteilung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String abteilung;

    public static Abteilung createAbteilung(Abteilung abteilung) {
        return abteilung;
    }

    @ManyToOne
    private ApplicationUser user;

    public void setUser(ApplicationUser user){ this.user = user;}

    public ApplicationUser getUser(){ return user;}

    public Long getId() {
        return id;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
}
