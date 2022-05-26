package cl.corona.bbook.logapimarca.client;

import cl.corona.bbook.logapimarca.config.BranchConfiguration;
import cl.corona.bbook.logapimarca.model.Branch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
@Slf4j
public class BranchClient implements BranchClientImpl {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    BranchConfiguration branchConfiguration;

    @Override
    public ResponseEntity<?> getBranch() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Bbook-Token", branchConfiguration.getBbookAppToken);

        HttpEntity<String> httpEntity = new HttpEntity(Branch, headers);
        String url = branchConfiguration.getBbookUrl();

        ResponseEntity<?> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<ResponseEntity<?>>() {
                });

        return response;
    }
}
