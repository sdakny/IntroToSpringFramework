package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;
/**
* SpringBoot startup class
*/
@SpringBootApplication
public class SpringDataJdbcSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
		.getBean(SpringDataJdbcSampleApplication.class).execute();
	}
	@Autowired
	MemberCrudRepository repository;
	/**
	*execute "insert" and "select"
	*/
	private void execute() {
		// insert
		executeInsert();
		// select
		executeSelect();
	}
	/**
	* insert
	*/
	private void executeInsert() {
		// create entity
		Member member = new Member(null, "花子");
		// use repository to insert, and get the result
		member = repository.save(member);
		// print the result
		System.out.println("登録したデータ:" + member);
	}
	/**
	* select
	*/
	private void executeSelect() {
		System.out.println("--- 全件取得します ---");
		// use repository to select, and get the result
		Iterable<Member> members = repository.findAll();
		for (Member member : members) {
			System.out.println(member);
		}
	}
}