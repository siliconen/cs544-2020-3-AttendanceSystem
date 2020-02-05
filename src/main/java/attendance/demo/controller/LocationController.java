package attendance.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import attendence.demo.domain.Location;

import attendence.demo.service.location.LocationService;

public class LocationController {
	@Autowired
	private LocationService locationService;

	
	@RequestMapping(value="/locations", method=RequestMethod.GET)
	public List<Location> getAllLocations() {
		System.out.println("----getAllLocations()------");
		return locationService.getAllLocations();
		 
	} 

	@RequestMapping(value="/locations", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	 public Location addLocation(@RequestBody Location location) {
		System.out.println("----addLocations()------");
		return locationService.addLocation(location);
	}

	@RequestMapping(value="/locations/{id}", method=RequestMethod.GET)
	public Location getLocation(@PathVariable int id, Model model) {
		System.out.println("----getLocation()------");
		return locationService.getLocationById(id);
		
	}
	
	@RequestMapping(value="/locations/{id}", method=RequestMethod.POST)
	public Location updateLocation(@PathVariable int id) {
		
		System.out.println("----updateLocation()------");
		Location location=locationService.getLocationById(id);
		
		return locationService.updateLocation(location); 
	
	}

	@RequestMapping(value="/deleteLocations/{id}", method=RequestMethod.POST)
	public boolean deleteLocation(@PathVariable int id) {
		System.out.println("----deleteLocation()------");
		return  locationService.deleteLocationById(id);
		
	}
}
