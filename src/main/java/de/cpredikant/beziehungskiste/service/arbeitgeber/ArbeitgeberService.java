package de.cpredikant.beziehungskiste.service.arbeitgeber;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitgeber;

public interface ArbeitgeberService {

    Arbeitgeber createArbeitgeber(Arbeitgeber arbeitgeber);

    Arbeitgeber updateArbeitgeber(Arbeitgeber arbeitgeber);

    Arbeitgeber readArbeitgeber(String arbeitgeberNr);

    void deleteArbeitgeberById(String arbeitgeberNr);

    void deleteArbeitgeber(Arbeitgeber arbeitgeber);
}

