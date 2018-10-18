package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "dl_ag_bez")
public class DienstleisterArbeitgeberBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "dl_vb_bez_gen", sequenceName = "dl_vb_bez_seq")
    @GeneratedValue(generator = "dl_vb_bez_gen")
    private Long id;

    @Version
    private Long version;

    private String vonDienstleisterNr;

    private String zuArbeitgeberNr;

    private LocalDate beginn;

    private LocalDate ende;

}
