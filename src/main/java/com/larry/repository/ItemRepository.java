package com.larry.repository;

import com.larry.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hangyanjiang on 2017/6/14.
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {



}
