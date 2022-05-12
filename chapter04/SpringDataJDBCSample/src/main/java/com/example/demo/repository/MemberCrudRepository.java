package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Member;

/**
 *  Member table: repositary
 */

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
