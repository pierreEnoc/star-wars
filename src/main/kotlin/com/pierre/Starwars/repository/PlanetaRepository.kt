package com.pierre.Starwars.repository

import com.pierre.Starwars.model.Planeta
import org.springframework.data.jpa.repository.JpaRepository

interface PlanetaRepository : JpaRepository <Planeta, Long> {
}