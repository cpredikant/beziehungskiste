package de.cpredikant.beziehungskiste.service.adresse;

import de.cpredikant.beziehungskiste.model.persistence.partner.AdresseEntity;

public interface AdresseService {

    AdresseEntity createAdresse(AdresseEntity adresseEntity);

    AdresseEntity findByPartnerNr(String partnerNr);

}
