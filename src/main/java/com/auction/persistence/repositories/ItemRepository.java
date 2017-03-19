package com.auction.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auction.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
