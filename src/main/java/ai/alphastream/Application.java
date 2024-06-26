package ai.alphastream;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ai.alphastream.model.DataPoint;
import ai.alphastream.model2.ParsedDatum;
import ai.alphastream.model2.ParsedOriginalPdf;
import ai.alphastream.model.ParsedPdf;
import ai.alphastream.model2.Value;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = getClass().getClassLoader().getResourceAsStream("parsedFullPdf.json");
        ParsedOriginalPdf parsedOriginalPdf;
        try {
            parsedOriginalPdf = mapper.readValue(is, ParsedOriginalPdf.class);
        } catch (IOException e) {
            LOG.error(e.getMessage());
            throw new RuntimeException(e);
        }

        Map<String, Value> map = new HashMap<>();
        for (ParsedDatum parsedDatum: parsedOriginalPdf.getData().getParsedData()) {
            for (Value value: parsedDatum.getValue()) {
                map.put("D".concat(value.getDataPointId().toString()), value);
            }
        }

        try {
            mapper.writeValue(new File("C:\\Users\\PreyanshMitharwal\\git\\mvel\\file.json"), map);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
                for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}