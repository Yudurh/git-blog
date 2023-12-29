package com.study.springboot.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    //기본함수 : findAll, findById, count, save, update

}
