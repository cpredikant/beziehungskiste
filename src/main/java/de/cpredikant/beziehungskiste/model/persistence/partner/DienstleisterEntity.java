package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.DienstleisterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "DIENSTLEISTER", schema = "PARTNER")
public class DienstleisterEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DL_NR", length = 50)
    private String dienstleisterNr;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "DIENSTLEISTER_TYP", nullable = false, length = 20)
    private DienstleisterTyp dienstleisterTyp;

    @Column(name = "RECHTSFORM_TYP", nullable = false, length = 20)
    private RechtsformTyp rechtsformTyp;

    @Column(name = "FIRMENNAME", length = 3000)
    private String frimenname;

    @Column(name = "ANREDE_TYP", length = 20)
    private AnredeTyp anredeTyp;

    @Column(name = "VORNAME", length = 100)
    private String vorname;

    @Column(name = "NACHNAME", length = 100)
    private String nachname;

}
