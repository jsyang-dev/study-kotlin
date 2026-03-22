package me.study.kotlin.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HealthControllerTest {
    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun `health check returns 200 OK with status OK`() {
        // when
        val response = restTemplate.getForEntity("/api/health", String::class.java)

        // then
        assertAll(
            { assertThat(response.statusCode).isEqualTo(HttpStatus.OK) },
            { assertThat(response.body).contains("\"status\":\"OK\"") }
        )
    }
}