package attendence.demo.service.location;

import java.util.List;

import attendence.demo.domain.Location;

public interface LocationService {
	public boolean deleteLocationById(int id);

	public Location getLocationById(int id);

	public Location addLocation(Location location);

	public Location updateLocation(Location location);

	List<Location> getAllLocations();
}
