package com.infosys.itinerary.itinerary.dbservice.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.itinerary.itinerary.model.City;
import com.infosys.itinerary.itinerary.repository.CityRepository;

/**
 * DbServiceResource class handles all the requests
 * @author Sudharshan
 *
 */
@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

    private CityRepository cityRepository;

    public DbServiceResource(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    
    /**
     * GetQuotes operation used to fetch the data by city name the Database table
     * @param city
     * @return List<City> city
     */
    @GetMapping("/{cityname}")
    public List<City> getQuotes(@PathVariable("cityname") final String cityname) {

        return getQuotesByUserName(cityname);
    }

    /**
     * Add operation is used to add city itinerary details to the Database table  
     * @param city
     * @return List<City> city
     */
    @PostMapping("/add")
    public List<City> add(@RequestBody final City city) {

       cityRepository.save(city);
        return getQuotesByUserName(city.getCity());
    }


    /**
     * GetQuotesByUserName operation is utility operation used to fetch the data by city name the Database table  
     * @param city
     * @return List<City> city
     */
    private List<City> getQuotesByUserName(@PathVariable("cityname") String cityname) {
        return cityRepository.findByCity(cityname);
                
    }



}
