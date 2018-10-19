package de.cpredikant.beziehungskiste.controller;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.GeschlechtTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitnehmerEntity;
import de.cpredikant.beziehungskiste.service.arbeitnehmer.ArbeitnehmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.GeneratedValue;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import java.time.LocalDate;

@RestController
public class BeziehungskisteController {

    @Autowired
    private ArbeitnehmerService arbeitnehmerService;


    @RequestMapping(method = RequestMethod.PUT, path = "/arbeitnehmer")
    public void createArbeitnehmer() {

        ArbeitnehmerEntity ae = new ArbeitnehmerEntity();

        ae.setAnredeTyp(AnredeTyp.HERR);
        ae.setArbeitnehmerNr("12345678");
        ae.setGeburtsdatum(LocalDate.now());
        ae.setGeburtsort("Hier");
        ae.setGeschlechtTyp(GeschlechtTyp.MAENNLICH);
        ae.setNachname("Muster");
        ae.setVorname("Max");
        ae.setSozialversicherungsNr("987654321");

        arbeitnehmerService.createArbeitnehmer(ae);


    }

    @RequestMapping(method = RequestMethod.GET, path = "/arbeitnehmerladen")
    public ArbeitnehmerEntity readArbeitnehmer() {
        return arbeitnehmerService.readArbeitnehmer("12345678");
    }
    
}
