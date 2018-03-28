package com.nuxsoftware.kotlindemo.config

import liquibase.integration.spring.SpringLiquibase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class LiquibaseConfig {
    @Bean
    fun liquibase(dataSource: DataSource): SpringLiquibase {
        return SpringLiquibase()
                .apply { setDataSource(dataSource) }
                .apply { changeLog = "classpath:db/master.xml" }
    }
}