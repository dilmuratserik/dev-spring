package com.dev.app.devspring.repository;

import com.dev.app.devspring.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Принцип ООП:абстракция-реализация - здесь описываем все доступные способы доступа к данным
@Repository
public interface PriorityRepository extends JpaRepository<Priority,Long> {

}
