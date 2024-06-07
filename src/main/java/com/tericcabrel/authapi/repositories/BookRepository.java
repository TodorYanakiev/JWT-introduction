package com.tericcabrel.authapi.repositories;

import com.tericcabrel.authapi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
