package company.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.User;
public interface UserDao extends JpaRepository<User, Integer>{

}
