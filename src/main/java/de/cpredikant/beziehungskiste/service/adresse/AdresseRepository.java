package de.cpredikant.beziehungskiste.service.adresse;

import de.cpredikant.beziehungskiste.model.persistence.partner.AdresseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdresseRepository extends CrudRepository<AdresseEntity, Long> {

    Optional<AdresseEntity> findByPartnerNr(String partnerNr);

}
