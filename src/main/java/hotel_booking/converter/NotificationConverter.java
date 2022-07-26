package hotel_booking.converter;

import org.springframework.stereotype.Component;

import hotel_booking.dto.NotificationDTO;
import hotel_booking.entity.Notification;

@Component
public class NotificationConverter {

	public NotificationDTO toDTO(Notification entity) {
		int notificationID = entity.getNotificationID();
		String title = entity.getTitle();
		String content = entity.getContent();
		boolean isShow = entity.isShow();
		NotificationDTO dto = new NotificationDTO(notificationID,title, content, isShow);
		return dto;

	}

}
