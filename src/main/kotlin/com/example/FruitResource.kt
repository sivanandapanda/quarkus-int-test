package com.example

import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/fruit")
class FruitResource(private val fruitRepository: FruitRepository) {

    @POST
    @Transactional
    fun create(fruit: Fruit): Response {
        fruitRepository.persist(FruitEntity().apply { name = fruit.name })
        return Response.ok().build()
    }

    @GET
    fun getAll() = Fruits.from(fruitRepository.listAll())

}

data class Fruit(var name: String = "")

data class Fruits(val fruits: List<Fruit> = emptyList()) {
    companion object {
        fun from(fruits: List<FruitEntity>): Fruits {
            return Fruits(fruits.map { Fruit(it.name) })
        }
    }
}

