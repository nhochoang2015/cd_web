package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.NotificationConverter;
import hotel_booking.dto.NotificationDTO;
import hotel_booking.entity.Notification;
import hotel_booking.repository.NotificationRepository;

@Service
public class NotificationService {
	@Autowired
	private NotificationConverter notificationConverter;
	@Autowired
	private NotificationRepository notificationRepository;
	List<NotificationDTO> notes = new ArrayList<NotificationDTO>();
	// list thông báo
	public List<NotificationDTO> findAllNotification(){
		List<Notification> notesList = notificationRepository.findAll();
		List<NotificationDTO> notesDTOList = new ArrayList<NotificationDTO>();
		for(Notification note : notesList) {
			notesDTOList.add(notificationConverter.toDTO(note));
		}
		return notesDTOList;
	}
	//
	public NotificationDTO findNotificationByID(int notificationID) {
		Notification note = notificationRepository.findByNotificationID(notificationID);
		note.getTitle();
		note.getContent();
		return notificationConverter.toDTO(note);
	}
	// tạo thông báo
	public void createNotification(String title,String content) {
		Notification note = new Notification();
		note.setTitle(title);
		note.setContent(content);
		note.setShow(true);
		notificationRepository.save(note);
	}
	// sửa thông báo
	public void updateNotification(int notificationID, String title, String content ) {
		Notification note = notificationRepository.findByNotificationID(notificationID);
		note.setTitle(title);
		note.setContent(content);
		notificationRepository.save(note);
	}
	// xóa thông báo
	public void deleteNotification(int notificationID) {
		Notification note = notificationRepository.findByNotificationID(notificationID);
		notificationRepository.delete(note);
	}
}
