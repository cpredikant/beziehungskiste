package de.cpredikant.beziehungskiste.service.partner.vertreter;

import de.cpredikant.beziehungskiste.model.persistence.partner.VertreterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VertreterRepository extends CrudRepository<VertreterEntity, Long> {

}
