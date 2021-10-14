package com.fis.business.repo;

import com.fis.business.dao.UserDao;
import com.fis.business.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,String>, UserDao {

}
