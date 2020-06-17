package com.pierre.Starwars.Controller

import com.pierre.Starwars.model.Planeta
import com.pierre.Starwars.service.PlanetaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/planetas"])
class PlanetaController {
    @Autowired
    lateinit var planetaService: PlanetaService
    
    @PostMapping
    fun create(@RequestBody planeta : Planeta) : ResponseEntity<String>{
        planetaService.create(planeta)
        return ResponseEntity(HttpStatus.OK)
    }
    
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Any>{
       var planeta =   planetaService.getPlanetaById(id)
        return  if (planeta != null )
            return ResponseEntity(planeta,HttpStatus.OK)
        else
            return ResponseEntity(HttpStatus.NOT_FOUND)
    }
    
  
   
    
}