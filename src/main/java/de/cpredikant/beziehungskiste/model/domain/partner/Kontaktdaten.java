package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kontaktdaten implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String telefonNr;

    private String faxNr;

    private String mobilNr;

    private boolean hauptKontaktdaten;

}
