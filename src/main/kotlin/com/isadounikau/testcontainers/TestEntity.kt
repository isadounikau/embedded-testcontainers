package com.isadounikau.testcontainers

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class TestEntity {

    @Id
    @GeneratedValue
    var id: Long? = null

    lateinit var value: String
}
