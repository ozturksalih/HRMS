package company.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.SchoolDepartment;

public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment , Integer>{

}
