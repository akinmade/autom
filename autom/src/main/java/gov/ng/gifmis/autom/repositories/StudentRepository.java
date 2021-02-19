package gov.ng.gifmis.autom.repositories;


import gov.ng.gifmis.autom.entities.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Students, Long>{

}
