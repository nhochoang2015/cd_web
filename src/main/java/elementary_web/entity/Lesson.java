package elementary_web.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "BAI_HOC")
public class Lesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_BAI_HOC")
	private int lessonID;
	@Column(name = "TEN_BAI_HOC")
	private String lessonName;
	@ManyToOne
	@JoinColumn(name = "MA_CHUONG", nullable = false)
	private Chapter chapter;

	@ManyToOne(fetch = FetchType.LAZY)

	private Lesson lessonBefore; // Sếp trực tiếp
	@ManyToMany(mappedBy = "lessonBefore")

	private List<Lesson> lessonAfter;
	@OneToMany(mappedBy = "lesson")
	private List<Question> questionList;
	@OneToMany(mappedBy = "lesson")
	private List<LessonComplete> lessonCompleteList;
	public int getLessonID() {
		return lessonID;
	}
	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public Chapter getChapter() {
		return chapter;
	}
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	public Lesson getLessonBefore() {
		return lessonBefore;
	}
	public void setLessonBefore(Lesson lessonBefore) {
		this.lessonBefore = lessonBefore;
	}
	public List<Lesson> getLessonAfter() {
		return lessonAfter;
	}
	public void setLessonAfter(List<Lesson> lessonAfter) {
		this.lessonAfter = lessonAfter;
	}
	public List<Question> getQuestionList() {
		return questionList;
	}
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
	public List<LessonComplete> getLessonCompleteList() {
		return lessonCompleteList;
	}
	public void setLessonCompleteList(List<LessonComplete> lessonCompleteList) {
		this.lessonCompleteList = lessonCompleteList;
	}

}

