package de.cpredikant.beziehungskiste.service.partner.arbeitgeber;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitgeber;

import java.util.List;

public interface ArbeitgeberService {

    Arbeitgeber createArbeitgeber(Arbeitgeber arbeitgeber);

    Arbeitgeber updateArbeitgeber(Arbeitgeber arbeitgeber);

    Arbeitgeber readArbeitgeber(String arbeitgeberNr);

    List<Arbeitgeber> readArbeitgeber();

    void deleteArbeitgeberById(String arbeitgeberNr);

    void deleteArbeitgeber(Arbeitgeber arbeitgeber);
}

