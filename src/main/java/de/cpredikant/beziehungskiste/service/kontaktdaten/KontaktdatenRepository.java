package de.cpredikant.beziehungskiste.service.kontaktdaten;

import de.cpredikant.beziehungskiste.model.persistence.partner.KontaktdatenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KontaktdatenRepository extends CrudRepository<KontaktdatenEntity, Long> {

    Optional<KontaktdatenEntity> findByPartnerNr(String partnerNr);

}
