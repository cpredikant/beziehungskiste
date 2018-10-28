package de.cpredikant.beziehungskiste.service.partner.emailadresse;

import de.cpredikant.beziehungskiste.model.persistence.partner.EmailadresseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmailadresseRepository extends CrudRepository<EmailadresseEntity, Long> {

    Optional<EmailadresseEntity> findByPartnerNr(String partnerNr);

    Iterable<EmailadresseEntity> findAllByPartnerNr(String partnerNr);

}
