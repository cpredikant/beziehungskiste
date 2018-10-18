package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.GeschlechtTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ARBEITNEHMER", schema = "PARTNER")
public class ArbeitnehmerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "AN_NR", length = 50)
    private String arbeitnehmerNr;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "ANREDE_TYP", length = 20, nullable = false)
    private AnredeTyp anredeTyp;

    @Column(name = "TITEL_TYP", length = 20)
    private TitelTyp titelTyp;

    @Column(name = "GESCHLECHT_TYP", length = 20, nullable = false)
    private GeschlechtTyp geschlechtTyp;

    @Column(name = "VORNAME", length = 100, nullable = false)
    private String vorname;

    @Column(name = "NACHNAME", length = 100, nullable = false)
    private String nachname;

    @Column(name = "GEBURTSDATUM", nullable = false)
    private LocalDate geburtsdatum;

    @Column(name = "GEBURTSORT", length = 200)
    private String geburtsort;

    @Column(name = "SOZ_VERS_NR", length = 50, nullable = false)
    private String sozialversicherungsNr;

}
