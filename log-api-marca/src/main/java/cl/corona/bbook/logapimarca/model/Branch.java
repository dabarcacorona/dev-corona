package cl.corona.bbook.logapimarca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity

@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "Bbook_Marca",
                procedureName = "bbook_intregaciones.Prc_Marca",
                parameters = {@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR,
                        name = "c",
                        type = Branch.class)})})
public class Branch implements Serializable {

    @Id

    private String id;

    private String name;

    private String inactive;

}

