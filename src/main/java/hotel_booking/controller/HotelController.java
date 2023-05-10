package hotel_booking.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.LocationDTO;
import hotel_booking.dto.RoomDTO;
import hotel_booking.service.RoomRegisterService;
import hotel_booking.service.RoomService;
import hotel_booking.service.HotelService;
import hotel_booking.service.LocationService;

import org.springframework.util.StringUtils;
@Controller
public class HotelController {
	@Autowired
	private HotelService hotelService;
	@Autowired
	private RoomRegisterService subjectRegisterService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private RoomService roomService;
	
	
	@RequestMapping("/search")
	public ModelAndView searchLocation(@RequestParam int locationID){
		List<HotelDTO> hotelDTOList = hotelService.findAllHotelByLocationID(locationID);
		ModelAndView mav = new ModelAndView("./user_page/search");	
		mav.addObject("hotelDTOList", hotelDTOList);
		return mav;
	}
	@GetMapping("/hotel")
	public ModelAndView hotelPage(@RequestParam int hotelID) {
		HotelDTO hotelDTO = hotelService.findHotelByID(hotelID);
		List<RoomDTO> roomDTOList = roomService.findAllRoomByID(hotelID);
		ModelAndView mav = new ModelAndView("./user_page/hotel");
		mav.addObject("hotelDTO", hotelDTO);
		mav.addObject("roomDTOList", roomDTOList);
		return mav;
	}
	
	
	
	@GetMapping("/room")
	public ModelAndView roomPage(@RequestParam int roomID ) {
		RoomDTO roomDTO = roomService.findEntityByRoomID(roomID);
		ModelAndView mav = new ModelAndView("./user_page/room");
		mav.addObject("roomDTO", roomDTO);
		return mav;
	}
	
	
	

}
