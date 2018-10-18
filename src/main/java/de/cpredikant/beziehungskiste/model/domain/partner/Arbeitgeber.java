package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.domain.bau.Verband;
import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "arbeitgeber")
public class Arbeitgeber implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String arbeitgeberNr;

    @Version
    private Long version;

    private String firmenname;

    private AnredeTyp anredeTyp;

    private String vorname;

    private String nachname;

    private RechtsformTyp rechtsformTyp;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitgeber")
    private List<Bankkonto> bankkonto;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitgeber")
    private Adresse adressen;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitgeber")
    private List<Vertreter> vertreter;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitgeber")
    private List<Kontaktdaten> kontaktdaten;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitgeber")
    private List<Kontaktperson> kontaktpersonen;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitgeber")
    private List<Verband> verband;


}
