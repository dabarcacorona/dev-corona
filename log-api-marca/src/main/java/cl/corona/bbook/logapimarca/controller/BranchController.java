package cl.corona.bbook.logapimarca.controller;

import cl.corona.bbook.logapimarca.dao.BranchDao;
import cl.corona.bbook.logapimarca.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@RestController
public class BranchController {

    @Autowired
    private BranchDao dao;
    private BranchService service;
    RestTemplate restTemplate;


    @CrossOrigin(origins = { "*" }, maxAge = 6000)
    @GetMapping(path = "/Marca", produces=MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, Object> ListaMarca2() {

        return dao.getMarca3();

    }

}
