package com.isadounikau.testcontainers

import org.springframework.data.repository.CrudRepository
import javax.annotation.Resource

@Resource
interface EntityRepository : CrudRepository<TestEntity, Long>
