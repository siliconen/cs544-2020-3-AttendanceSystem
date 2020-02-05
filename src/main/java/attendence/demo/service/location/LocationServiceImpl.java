package attendence.demo.service.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import attendence.demo.domain.Location;
import attendence.demo.repository.LocationRepository;

public class LocationServiceImpl {

	@Autowired
	private LocationRepository locationRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Location addLocation(Location location) {
		locationRepository.saveAndFlush(location);
		
		return location;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Location updateLocation(Location location) {
		
		
		locationRepository.saveAndFlush(location);
		return location;
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean deleteLocationById(int id) {
		locationRepository.deleteById(id);
		return true;
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public Location getLocationById(int id) {
		Optional<Location> opt= locationRepository.findById(id);
		return opt.get();
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<Location> getAllLocations() {
		
		return locationRepository.findAll();
	}
}
