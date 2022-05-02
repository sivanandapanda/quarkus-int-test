package com.example

import io.quarkus.test.junit.QuarkusTestProfile

class IntegrationTestProfile: QuarkusTestProfile {

    override fun getConfigOverrides(): Map<String?, String?> {
        return mapOf(
            Pair("quarkus.datasource.jdbc.url", "jdbc:h2:tcp://localhost/mem:test"),
            Pair("quarkus.datasource.db-kind", "h2")
        )
    }

}