package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class description
 * @author test
 * @version 1.1
 */
@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest", "pl.put.poznan.transformer.exceptions"})
public class JsonToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonToolsApplication.class, args);
    }
}
