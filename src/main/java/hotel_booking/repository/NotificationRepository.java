package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
	Notification findByNotificationID(int notificationID);
	
	Notification deleteByNotificationID(int notificationID);
}
