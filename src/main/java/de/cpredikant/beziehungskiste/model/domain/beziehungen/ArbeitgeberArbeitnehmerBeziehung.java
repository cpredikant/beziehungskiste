package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import de.cpredikant.beziehungskiste.model.enums.beziehungen.BeziehungsTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ag_an_bez")
public class ArbeitgeberArbeitnehmerBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "ag_an_bez_gen", sequenceName = "ag_an_bez_seq")
    @GeneratedValue(generator = "ag_an_bez_gen")
    private Long id;

    @Version
    private Long version;

    private String vonArbeitgeberNr;

    private String zuArbeitnehmerNr;

    private BeziehungsTyp beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
