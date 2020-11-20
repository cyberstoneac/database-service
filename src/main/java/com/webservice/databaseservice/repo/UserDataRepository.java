package com.webservice.databaseservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.databaseservice.model.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Integer> {

}
