package com.example

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class FruitRepository: PanacheRepository<FruitEntity>
