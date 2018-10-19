package de.cpredikant.beziehungskiste.service.adresse;

import de.cpredikant.beziehungskiste.model.persistence.partner.AdresseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresseServiceImpl implements AdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    @Override
    public AdresseEntity createAdresse(AdresseEntity adresseEntity) {
        return adresseRepository.save(adresseEntity);
    }

    @Override
    public AdresseEntity findByPartnerNr(String partnerNr) {
        return null;
    }


}
