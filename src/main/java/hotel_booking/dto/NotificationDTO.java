package hotel_booking.dto;

public class NotificationDTO {

	private int notificationID;
	private String title;
	private String content;
	private boolean isShow;

	public NotificationDTO(int notificationID, String title, String content, boolean isShow) {
		super();
		this.notificationID = notificationID;
		this.title = title;
		this.content = content;
		this.isShow = isShow;
	}

	public int getNotificationID() {
		return notificationID;
	}

	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
