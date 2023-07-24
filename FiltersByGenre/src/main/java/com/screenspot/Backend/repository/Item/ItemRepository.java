package com.screenspot.Backend.repository.Item;

import com.screenspot.Backend.entiry.Items.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}

