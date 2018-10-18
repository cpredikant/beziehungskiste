package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.KontaktpersonTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "KONTAKTPERSON", schema = "PARTNER")
public class Kontaktperson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "KONTAKTPERSON_GEN", sequenceName = "KONTAKTPERSON_SEQ")
    @GeneratedValue(generator = "KONTAKTPERSON_GEN")
    @Column(name="ID")
    private Long id;

    @Version
    @Column(name="VERSION")
    private Long version;

    @Column(name="KONTAKTPERSON_TYP",nullable = false)
    private KontaktpersonTyp kontaktPersonTyp;

    @Column(name="ANREDE_TYP", nullable = false)
    private AnredeTyp anredeTyp;

    @Column(name="KONTAKTPERSON_TYP")
    private TitelTyp titelTyp;

    private String vorname;

    private String nachname;

    private Adresse adresse;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dienstleister")
    private Kontaktdaten kontaktdaten;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dienstleister")
    private Emailadresse emailadresse;

}
