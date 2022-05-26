package cl.corona.bbook.logapimarca.dao;

import cl.corona.bbook.logapimarca.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BranchDao {

    @Autowired
    private EntityManager em;

    public HashMap<String, Object> getMarca3(){

        StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("Bbook_Marca");

        List<Object[]> rows = spq.getResultList();

        List<Branch> result = new ArrayList<>();
        for (Object[] row : rows) {
            result.add(
                    new Branch((String) row[0],
                            (String) row[1],
                            (String) row[2]));
        }

        HashMap<String, Object> finalMap = new HashMap<>();
        finalMap.put("data", result);
        return finalMap;

    }

}
