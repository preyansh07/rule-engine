package ai.alphastream.service;

import ai.alphastream.model.ParsedPdf;
import ai.alphastream.model2.ParsedDatum;
import ai.alphastream.model2.ParsedOriginalPdf;
import ai.alphastream.model2.Value;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ValidationService {

    @Autowired
    private KieContainer kieContainer;

    public ParsedOriginalPdf getValidatedPdf(ParsedOriginalPdf parsedOriginalPdf) {
//        ParsedPdf deepCopy;
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            deepCopy = objectMapper
//                    .readValue(objectMapper.writeValueAsString(parsedPdf), ParsedOriginalPdf.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }

        KieSession kieSession = kieContainer.newKieSession();
//        kieSession.setGlobal("globalValue", deepCopy.getData().getParsedData().getValue());

        Map<String, List<Long>> validationRulesMap = new HashMap<>();
        List<Long> notEmptyDataPointIds = new ArrayList<>();
        notEmptyDataPointIds.add(1008L);
        notEmptyDataPointIds.add(5518L);
        validationRulesMap.put("NotEmpty", notEmptyDataPointIds);
        List<Long> percentageDataPointIds = new ArrayList<>();
        percentageDataPointIds.add(1775L);
        validationRulesMap.put("Percentage", percentageDataPointIds);
        List<Long> moneyDataPointIds = new ArrayList<>();
        moneyDataPointIds.add(1008L);
        validationRulesMap.put("Money", moneyDataPointIds);
        kieSession.setGlobal("globalValidationRulesMap", validationRulesMap);
        kieSession.setGlobal("globalNonEmptyList", notEmptyDataPointIds);
//        kieSession.insert(parsedPdf.getData().getParsedData().getValue());
        for (ParsedDatum parsedDatum: parsedOriginalPdf.getData().getParsedData()) {
            for (Value value: parsedDatum.getValue()) {
                kieSession.insert(value);
            }
        }
//        kieSession.insert(parsedPdf.getData().getParsedData().getValue().getD1008());
//        kieSession.insert(parsedPdf.getData().getParsedData().getValue().getD5518());

        kieSession.fireAllRules();
        kieSession.dispose();
        return parsedOriginalPdf;
    }

}
