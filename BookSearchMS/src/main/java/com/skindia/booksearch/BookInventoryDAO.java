package com.skindia.booksearch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookInventoryDAO extends JpaRepository<BookInventory,Integer> {
}