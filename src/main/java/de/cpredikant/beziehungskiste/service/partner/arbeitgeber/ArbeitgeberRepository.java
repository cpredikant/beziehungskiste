package de.cpredikant.beziehungskiste.service.partner.arbeitgeber;

import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitgeberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbeitgeberRepository extends CrudRepository<ArbeitgeberEntity, String> {

}

