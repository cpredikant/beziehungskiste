package de.cpredikant.beziehungskiste.model.domain.bau;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "VERBAND", schema = "PARTNER")
public class Verband implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private String verbandNr;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "BEZEICHNUNG")
    private String bezeichnung;

}
