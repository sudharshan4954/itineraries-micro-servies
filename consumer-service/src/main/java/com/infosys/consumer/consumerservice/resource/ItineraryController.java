package com.infosys.consumer.consumerservice.resource;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infosys.consumer.consumerservice.config.City;

/**
 * ItineraryController class will handle all the requests which are coming form the Client
 * 
 * @author Sudharshan
 *
 */
@RestController
@RequestMapping("/rest/itinary")
public class ItineraryController {
	@Autowired
    RestTemplate restTemplate;

    /**
     * GetCityWithLessTime method will takes city name as an argument and filters the
     * result set and return destiny city, we can reach in less time
     * @param cityname
     * @return City
     */
    @GetMapping("/lessintime/{cityname}")
    public City getCityWithLessTime(@PathVariable("cityname") final String cityname) {

        ResponseEntity<List<City>> quoteResponse = restTemplate.exchange("http://itinerary-service/rest/db/" + cityname, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<City>>() {
                });
        List<City> cityList = quoteResponse.getBody();
        Comparator <City> comparator = (c1, c2) -> Integer.compare(c1.getTravelTime(), c2.getTravelTime());
        City nearestCity = cityList.stream().min(comparator).get();
        return nearestCity;
    }
    
    /**
     * GetCityWithLessConnections method will takes city name as an argument and filters the
     * result set and return destiny city, which is having less number of connection
     * @param cityname
     * @return City
     */
    @GetMapping("/lessinconnections/{cityname}")
    public City getCityWithLessConnections(@PathVariable("cityname") final String cityname) {

        ResponseEntity<List<City>> quoteResponse = restTemplate.exchange("http://localhost:8300/rest/db/" + cityname, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<City>>() {
                });
        List<City> cityList = quoteResponse.getBody();
        Comparator <City> comparator = (c1, c2) -> Integer.compare(c1.getNoOfConnections(), c2.getNoOfConnections());
        City nearestCity = cityList.stream().min(comparator).get();
        return nearestCity;
    }
}
