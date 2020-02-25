package com.offcn.dao;

import com.offcn.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Long> {
}
