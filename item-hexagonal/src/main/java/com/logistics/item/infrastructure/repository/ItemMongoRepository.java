package com.logistics.item.infrastructure.repository;

import com.logistics.item.infrastructure.repository.entity.ItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemMongoRepository extends MongoRepository<ItemEntity, String> {
    List<ItemEntity> findByName(String name);
}
