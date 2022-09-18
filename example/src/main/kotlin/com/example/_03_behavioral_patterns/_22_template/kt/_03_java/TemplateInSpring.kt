package com.example._03_behavioral_patterns._22_template.kt._03_java

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.client.RestTemplate
import java.util.*

object TemplateInSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO 템플릿-콜백 패턴
        // JdbcTemplate
        val jdbcTemplate = JdbcTemplate()
        jdbcTemplate.execute("insert")

        // RestTemplate
        val restTemplate = RestTemplate()
        val headers = HttpHeaders()
        headers.accept =
            Arrays.asList(MediaType.APPLICATION_JSON)
        headers["X-COM-PERSIST"] = "NO"
        headers["X-COM-LOCATION"] = "USA"
        val entity = HttpEntity<String>(headers)
        val responseEntity = restTemplate
            .exchange("http://localhost:8080/users", HttpMethod.GET, entity, String::class.java)
    }

    @Configuration
    internal class SecurityConfig : WebSecurityConfigurerAdapter() {

        override fun configure(http: HttpSecurity) {
            http.authorizeRequests().anyRequest().permitAll()
        }
    }
}
