package com.libraryapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libraryapp.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
