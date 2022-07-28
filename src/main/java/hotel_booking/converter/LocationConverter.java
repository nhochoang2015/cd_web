package hotel_booking.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Converter;

import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.LocationDTO;
import hotel_booking.entity.Hotel;
import hotel_booking.entity.Location;
@Converter
public class LocationConverter {

	public static LocationDTO toDTO(Location entity) {
		 int locationID =entity.getLocationID();
		int accountID = entity.getAccount().getAccountID();
		 String locationName =entity.getLocationName();
		 String position = entity.getPosition();
		String pic = entity.getPic();
		List<HotelDTO> hotelDTOList = new ArrayList<HotelDTO>();
		Set<Hotel> hotelList = entity.getHotelList();
		for(Hotel hotel :hotelList) {
			hotelDTOList.add(HotelConverter.toDTO(hotel));
		}
		return new LocationDTO(locationID, accountID, locationName, position, pic, hotelDTOList);
	}

}
