package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.RoomConverter;
import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.PriceDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.entity.Room;
import hotel_booking.entity.Hotel;
import hotel_booking.repository.RoomRepository;
import hotel_booking.repository.HotelRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private HotelService subjectService;
	@Autowired
	private RoomConverter chapterConverter;
	@Autowired
	private HotelRepository subjectRepository;
	List<RoomDTO> chapters = new ArrayList<RoomDTO>();

	public Room findEntityByRoomID(int roomID) {
		Room room = roomRepository.findByRoomID(roomID);
		return room;
	}
	
	
	
//xóa chương
//	public void deleteChapterbyID(int chapterID) {
//		Chapter chapter = chapterRepository.findByChapterID(chapterID);
//		chapter.setActive(false);
//		chapterRepository.save(chapter);
//	}

// phục hồi chương
//	public void restoreChapterbyID(int chapterID) {
//		Chapter chapter = chapterRepository.findByChapterID(chapterID);
//		chapter.setActive(true);
//		chapterRepository.save(chapter);
//	}

// tạo chương
//	public void createChapter(String chapterName,int subjectID) {
//		Chapter chapter = new Chapter();
//		Subject subject = subjectRepository.findBySubjectID(subjectID);
//		chapter.setSubject(subject);
//		chapter.setChapterName(chapterName);
//		chapter.setActive(true);
//		chapterRepository.save(chapter);
//	}

// Sửa tên chương
//	public void renameChapter(int chapterID, String chapterName) {
//		Chapter chapter = chapterRepository.findByChapterID(chapterID);
//		chapter.setChapterName(chapterName);
//		chapterRepository.save(chapter);
//	}

//	public List<ChapterDTO> findAllChapter(int SubjectID) {
//		SubjectDTO subject = subjectService.findBySubjectID(SubjectID);
//		List<Chapter> chapterList = chapterRepository.findAll();
//		List<ChapterDTO> chapterDTOtList = subject.getChapterList();
//		for (Chapter chapter : chapterList) {
//			chapterDTOtList.add(chapterConverter.toDTO(chapter));
//		}
//		return chapterDTOtList;
//	}

//	public ChapterDTO findByChapterID(int chapterID) {
//		Chapter chapter = chapterRepository.findByChapterID(chapterID);
//		ChapterDTO chapterDTO = chapterConverter.toDTO(chapter);
//		return chapterDTO;
//	}

//	public Chapter findEntityByChapterID(int chapterID) {
//		Chapter chapter = chapterRepository.findByChapterID(chapterID);
//		return chapter;
//	}
}
