package com.pierre.Starwars.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Planeta (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0 ,
        val name : String = "",
        val clima : String = "",
        val terreno : Long = 0
)