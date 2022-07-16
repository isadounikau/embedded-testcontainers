package com.isadounikau.testcontainers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.repository.CrudRepository
import javax.annotation.Resource
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

fun main(args: Array<String>) {
	runApplication<TestcontainersApplication>(*args)
}

@SpringBootApplication
class TestcontainersApplication

@Entity
class TestEntity {

	@Id
	@GeneratedValue
	var id: Long? = null

	lateinit var value: String
}

@Resource
interface EntityRepository : CrudRepository<TestEntity, Long>
