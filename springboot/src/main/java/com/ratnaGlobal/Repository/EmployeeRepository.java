package com.ratnaGlobal.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.ratnaGlobal.Entity.Employee;
@Repository
@Component
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
