package ai.alphastream.controller;

import ai.alphastream.model.ParsedPdf;
import ai.alphastream.model2.ParsedOriginalPdf;
import ai.alphastream.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @PostMapping("/get-validated-pdf")
    public ResponseEntity<ParsedOriginalPdf> getValidatedPdf(@RequestBody ParsedOriginalPdf parsedOriginalPdf) {
        ParsedOriginalPdf parsedPdf1 = validationService.getValidatedPdf(parsedOriginalPdf);
        return new ResponseEntity<>(parsedPdf1, HttpStatus.OK);
    }
}
