package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.GeschlechtTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "arbeitnehmer")
public class Arbeitnehmer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String arbeitnehmerNr;

    @Version
    private Long version;

    private AnredeTyp anredeTyp;

    private TitelTyp titelTyp;

    private GeschlechtTyp geschlechtTyp;

    private String vorname;

    private String nachname;

    private LocalDate geburtsdatum;

    private String geburtsort;

    private String sozialversicherungsNr;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitnehmer")
    private Adresse adresse;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitnehmer")
    private Bankkonto bankkonto;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitnehmer")
    private Kontaktdaten kontaktdaten;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "arbeitnehmer")
    private Emailadresse emailadresse;

}
