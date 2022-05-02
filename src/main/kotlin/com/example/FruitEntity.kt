package com.example

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class FruitEntity {

    @Id
    @GeneratedValue
    var id: Long? = null

    lateinit var name: String

}
