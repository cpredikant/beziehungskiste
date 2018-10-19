package de.cpredikant.beziehungskiste.service.arbeitnehmer;

import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitnehmerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbeitnehmerRepository extends CrudRepository<ArbeitnehmerEntity, String> {
}
