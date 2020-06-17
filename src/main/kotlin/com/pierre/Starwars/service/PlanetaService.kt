package com.pierre.Starwars.service

import com.pierre.Starwars.model.Planeta
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface PlanetaService {
    fun create (planeta: Planeta)
    fun getPlanetaById(i: Long) : Planeta?
    fun delete(id: Long)
    fun update(id: Long, planeta: Planeta)
    fun findAll(pageable: Pageable): Page<Planeta>
    
}