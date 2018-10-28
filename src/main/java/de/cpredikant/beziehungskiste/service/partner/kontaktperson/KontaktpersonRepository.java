package de.cpredikant.beziehungskiste.service.partner.kontaktperson;

import de.cpredikant.beziehungskiste.model.persistence.partner.KontaktpersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontaktpersonRepository extends CrudRepository<KontaktpersonEntity, Long> {

}
