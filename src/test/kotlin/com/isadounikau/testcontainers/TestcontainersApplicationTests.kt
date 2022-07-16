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
		// simple objet for JPA, the ID isn't specified
		val expectedResult = TestEntity()
		expectedResult.value = "Test Data"

		// operation saves data into tests database
		val actualResult = entityRepository.save(expectedResult)

		// simple data verification
		assertThat(actualResult).isNotNull
		assertThat(actualResult.id).isNotNull
		assertThat(actualResult.value).isEqualTo(expectedResult.value)
	}

}
