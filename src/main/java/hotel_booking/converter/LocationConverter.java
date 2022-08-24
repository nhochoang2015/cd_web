package hotel_booking.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.LocationDTO;
import hotel_booking.entity.Hotel;
import hotel_booking.entity.Location;
@Component
public class LocationConverter {
@Autowired
private HotelConverter hotelConverter;

	public LocationDTO toDTO(Location entity) {
		 int locationID =entity.getLocationID();
		 String locationName =entity.getLocationName();
		 String position = entity.getPosition();
		String pic = entity.getPic();
		List<HotelDTO> hotelDTOList = new ArrayList<HotelDTO>();
		Set<Hotel> hotelList = entity.getHotelList();
		for(Hotel hotel :hotelList) {
			hotelDTOList.add(hotelConverter.toDTO(hotel));
		}
		return new LocationDTO(locationID, locationName, position, pic, hotelDTOList);
	}

}
