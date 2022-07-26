package hotel_booking.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import hotel_booking.compositeKey.LessonCompleteKey;

@Entity
@Table(name = "BAI_HOC_HOAN_THANH")
public class LessonComplete {

	@EmbeddedId
	private LessonCompleteKey id;
	@ManyToOne
	@MapsId("accountID")
	@JoinColumn(name = "MA_TAI_KHOAN")
	private Account account;
	@ManyToOne
	@MapsId("lessonID")
	@JoinColumn(name = "MA_BAI_HOC")
	private Lesson lesson;

	public LessonComplete() {
		super();
	}

	public LessonComplete(LessonCompleteKey id, Account account, Lesson lesson) {
		super();
		this.id = id;
		this.account = account;
		this.lesson = lesson;
	}

	public LessonCompleteKey getId() {
		return id;
	}

	public void setId(LessonCompleteKey id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

}
