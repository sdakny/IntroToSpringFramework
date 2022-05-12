package com.example.demo.entity;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Member table：entity
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	/** Member ID */
	@Id
	private Integer id;
	/** Member name */
	private String name;
}