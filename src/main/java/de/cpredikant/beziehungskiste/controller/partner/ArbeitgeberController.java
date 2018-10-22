package de.cpredikant.beziehungskiste.controller.partner;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitgeber;
import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitnehmer;
import de.cpredikant.beziehungskiste.model.domain.util.PartnerGenerator;
import de.cpredikant.beziehungskiste.model.domain.util.PartnerNrGenerator;
import de.cpredikant.beziehungskiste.service.partner.arbeitgeber.ArbeitgeberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArbeitgeberController {

    @Autowired
    private ArbeitgeberService arbeitgeberService;


    @PostMapping("/arbeitgeber")
    public Resource<Arbeitgeber> erstelleArbeitgeber(@RequestBody(required = false) final Arbeitgeber arbeitgeber) {

        final Arbeitgeber createdArbeitgeber;

        if (arbeitgeber == null) {
            createdArbeitgeber = arbeitgeberService.createArbeitgeber(
                    PartnerGenerator.erzeugeArbeitgeber(
                            PartnerNrGenerator.generiereArbeitgeberNummer()));
        } else {
            createdArbeitgeber = arbeitgeberService.createArbeitgeber(arbeitgeber);
        }


        return new Resource<>(createdArbeitgeber,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).leseArbeitgeber(
                                createdArbeitgeber.getArbeitgeberNr())).withRel("get"),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).aktualisiereArbeitgeber(
                                createdArbeitgeber)).withRel("put"),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).loescheArbeitgeber(
                                createdArbeitgeber.getArbeitgeberNr())).withRel("delete")
        );

    }

    @GetMapping("/arbeitgeber/{arbeitgeberNr}")
    public Resource<Arbeitgeber> leseArbeitgeber(@PathVariable final String arbeitgeberNr) {

        final Arbeitgeber arbeitgeber = arbeitgeberService.readArbeitgeber(arbeitgeberNr);

        return new Resource<>(arbeitgeber,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).leseArbeitgeber(
                                arbeitgeberNr)).withSelfRel(),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).loescheArbeitgeber(
                                arbeitgeber.getArbeitgeberNr())).withRel("delete"));
    }

    @PutMapping("/arbeitgeber")
    public Resource<Arbeitgeber> aktualisiereArbeitgeber(@RequestBody final Arbeitgeber arbeitgeber) {

        final Arbeitgeber updatedArbeitgeber = arbeitgeberService.updateArbeitgeber(arbeitgeber);

        return new Resource<>(updatedArbeitgeber,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).leseArbeitgeber(
                                updatedArbeitgeber.getArbeitgeberNr())).withRel("self"),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).loescheArbeitgeber(
                                updatedArbeitgeber.getArbeitgeberNr())).withRel("delete"));
    }

    @DeleteMapping("/arbeitgeber/{arbeitgeberNr}")
    public Resource<?> loescheArbeitgeber(@PathVariable final String arbeitgeberNr) {

        arbeitgeberService.deleteArbeitgeberById(arbeitgeberNr);

        return new Resource<>(Arbeitnehmer.class,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                ArbeitgeberController.class).erstelleArbeitgeber(new Arbeitgeber())).withRel("post"));
    }

    @DeleteMapping("/arbeitgeber")
    public ResponseEntity<?> loescheArbeitgeber(@RequestBody final Arbeitgeber arbeitgeber) {
        arbeitgeberService.deleteArbeitgeber(arbeitgeber);
        return ResponseEntity.noContent().build();
    }


}
