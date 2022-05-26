package cl.corona.bbook.logapimarca.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value={"application.properties"})
@Data
public class BranchConfiguration {

    @Value("${bbook.url.ms}")
    private String bbookUrl;

    @Value("${bbook.api.key}")
    private String bbookAppToken;

}
