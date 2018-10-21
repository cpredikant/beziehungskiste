package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bankkonto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String bic;

    private String iban;

    private String kontoNr;

    private String blz;

    private String kontoinhaber;

    private boolean winterbau;

    private boolean einzahlung;

    private boolean auszahlung;

    private boolean ausland;

}
