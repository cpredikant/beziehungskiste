package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ARBEITGEBER", schema = "PARTNER")
public class ArbeitgeberEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "AG_NR", length = 50)
    private String arbeitgeberNr;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "FIRMENNAME", length = 3000)
    private String firmenname;

    @Column(name = "ANREDE_TYP", length = 20)
    private AnredeTyp anredeTyp;

    @Column(name = "VORNAME", length = 100)
    private String vorname;

    @Column(name = "NACHNAME", length = 100)
    private String nachname;

    @Column(name = "RECHTSFORM_TYP", nullable = false, length = 20)
    private RechtsformTyp rechtsformTyp;


}
