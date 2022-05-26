package cl.corona.bbook.logapimarca.service;

import cl.corona.bbook.logapimarca.dao.BranchDao;
import cl.corona.bbook.logapimarca.model.Branch;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchDao dao;

    public List<Branch> proccess(){
        return null;
    }

}
