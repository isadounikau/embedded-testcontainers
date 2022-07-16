package com.isadounikau.testcontainers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class TestcontainersApplicationTests {

	@Autowired
	private lateinit var entityRepository: EntityRepository

	@Test
	fun contextLoads() {
	}

	@Test
	fun `should save entity into database`() {
		val expectedResult = TestEntity()
		expectedResult.value = "Test Data"

		val actualResult = entityRepository.save(expectedResult)

		assertThat(actualResult).isNotNull
		assertThat(actualResult.id).isNotNull
		assertThat(actualResult.value).isEqualTo(expectedResult.value)
	}

}
