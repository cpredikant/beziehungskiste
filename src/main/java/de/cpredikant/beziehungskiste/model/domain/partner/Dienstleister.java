package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.DienstleisterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "dienstleister")
public class Dienstleister implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String dienstleisterNr;

    @Version
    private Long version;

    private DienstleisterTyp dienstleisterTyp;

    private String frimenname;

    private AnredeTyp anredeTyp;

    private String vorname;

    private String nachname;

    private RechtsformTyp rechtsformTyp;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dienstleister")
    private Adresse adresse;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dienstleister")
    private List<Kontaktdaten> kontaktdaten;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dienstleister")
    private List<Kontaktperson> kontaktPersonen;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dienstleister")
    private List<Emailadresse> emailAdressesen;



}
