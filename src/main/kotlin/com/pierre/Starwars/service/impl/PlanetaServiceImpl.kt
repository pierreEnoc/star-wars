package com.pierre.Starwars.service.impl

import com.pierre.Starwars.model.Planeta
import com.pierre.Starwars.repository.PlanetaRepository
import com.pierre.Starwars.service.PlanetaService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class PlanetaServiceImpl(val planetaRepository: PlanetaRepository) : PlanetaService {
    
    override fun create(planeta: Planeta) {
        planetaRepository.save(planeta)
    }
    
    override fun getPlanetaById(id: Long): Planeta? {
       return planetaRepository.findByIdOrNull(id)
    }
    
    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }
    
    override fun update(id: Long, planeta: Planeta) {
        TODO("Not yet implemented")
    }
    
    override fun findAll(pageable: Pageable): Page<Planeta> {
        TODO("Not yet implemented")
    }
    
}