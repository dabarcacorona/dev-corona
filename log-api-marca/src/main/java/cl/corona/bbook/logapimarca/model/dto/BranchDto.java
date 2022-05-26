package cl.corona.bbook.logapimarca.model.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class BranchDto implements Serializable {

    private String id;

    private String name;

    private String inactive;

}
