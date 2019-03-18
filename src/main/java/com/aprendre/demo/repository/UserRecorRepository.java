package com.aprendre.demo.repository;
import com.aprendre.demo.classes.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRecorRepository extends CrudRepository <UserRecord, Integer> {
}
