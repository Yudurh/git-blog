package com.study.springboot.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    //기본함수 : findAll, findById, count, save, update
    //item_recommend
    List<ItemEntity> findByItemRecommend(int recommand);
    List<ItemEntity> findByItemCate(String category);


}
