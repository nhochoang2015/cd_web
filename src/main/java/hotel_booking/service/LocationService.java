package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.LocationConverter;
import hotel_booking.dto.LocationDTO;
import hotel_booking.entity.Location;
import hotel_booking.repository.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
	@Autowired
	private LocationConverter locationConverter;
	
	public List<LocationDTO> findAllLocation() {
		List<Location> locationList = locationRepository.findAll();
		List<LocationDTO> locationDTOtList = new ArrayList<LocationDTO>();
		for (Location location : locationList) {
			
			locationDTOtList.add(locationConverter.toDTO(location));
			
		}
		return locationDTOtList;
	}
	public List<LocationDTO> findAllByLocationName(String locationName){
		List<Location> locationList = locationRepository.findDistinctByLocationName(locationName);
		List<LocationDTO> locationDTOtList = new ArrayList<LocationDTO>();
		for (Location location : locationList) {
			
			locationDTOtList.add(locationConverter.toDTO(location));
			
		}
		return locationDTOtList;
	}
}
