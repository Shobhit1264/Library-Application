package com.libraryapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libraryapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
		
}
