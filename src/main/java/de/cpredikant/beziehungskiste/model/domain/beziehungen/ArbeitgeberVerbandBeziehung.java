package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ag_vb_bez")
public class ArbeitgeberVerbandBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "ag_vb_bez_gen", sequenceName = "ag_vb_bez_seq")
    @GeneratedValue(generator = "ag_vb_bez_gen")
    private Long id;

    @Version
    private Long version;

    private String vonArbeitgeberNr;

    private String zuVerbandNr;

    private LocalDate beginn;

    private LocalDate ende;

}
