package de.cpredikant.beziehungskiste.service.adresse;

import de.cpredikant.beziehungskiste.model.persistence.partner.AdresseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends CrudRepository<AdresseEntity, Long> {

}
