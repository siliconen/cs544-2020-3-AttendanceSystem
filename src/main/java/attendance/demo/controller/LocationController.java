package attendance.demo.controller;

import java.util.List;

import attendance.demo.domain.Location;
import attendance.demo.service.location.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class LocationController {
	@Autowired
	private LocationService locationService;


	@GetMapping(value="/locations")
	//@Secured({"ROLE_ADMIN","ROLE_FACULTY")
	public List<Location> getAllLocations() {
		return locationService.getAllLocations();

	}

	@PostMapping(value="/locations")
	//@Secured({"ROLE_ADMIN"})
	public Location addLocation(@RequestBody Location location, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("Error! Checkout your entries please ! ");
		}
		return locationService.addLocation(location);
	}

	@GetMapping(value="/locations/{id}")
	//@Secured({"ROLE_ADMIN","ROLE_FACULTY")
	public Location getLocation(@PathVariable Integer id) {
		return locationService.getLocationById(id);

	}

	@PutMapping(value="/locations")
	//@Secured({"ROLE_ADMIN"})
	public Location updateLocation(@RequestBody @Valid Location location, BindingResult result ) {
		if(result.hasErrors()) {
			System.out.println("Error! Checkout your entries please ! ");
		}
		return locationService.updateLocation(location);

	}

	@DeleteMapping(value="/locations/{id}")
	//@Secured({"ROLE_ADMIN"})
	public boolean deleteLocation(@PathVariable Integer id) {
		return  locationService.deleteLocationById(id);

	}
}
