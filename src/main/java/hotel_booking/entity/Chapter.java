package hotel_booking.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CHUONG")
public class Chapter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_CHUONG")
	private int chapterID;
	@Column(name = "TEN_CHUONG", columnDefinition = "nvarchar(max)")
	private String chapterName;
	@ManyToOne
	@JoinColumn(name = "MA_MON_HOC", nullable = false)
	private Subject subject;
	@Column(name = "HOAT_DONG")
	private boolean active;
	@Column(name = "DIEM")
	private int score;
	@OneToMany(mappedBy = "chapter", fetch = FetchType.EAGER)
	private Set<Lesson> lessonList;
	public int getChapterID() {
		return chapterID;
	}
	public void setChapterID(int chapterID) {
		this.chapterID = chapterID;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Set<Lesson> getLessonList() {
		return lessonList;
	}
	public void setLessonList(Set<Lesson> lessonList) {
		this.lessonList = lessonList;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
