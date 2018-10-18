package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "kontaktdaten")
public class Kontaktdaten implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "kontaktdaten_gen", sequenceName = "kontaktdaten_seq")
    @GeneratedValue(generator = "kontaktdaten_gen")
    private Long id;

    @Version
    private Long version;

    private String telefonNr;

    private String faxNr;

    private String mobilNr;

    private boolean hauptKontaktdaten;

}
