package hotel_booking.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "CAU_HOI")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_CAU_HOI")
	private int questionID;
	@Column(name = "NOI_DUNG", columnDefinition = "nvarchar(max)")
	private String content;
	@Column(name = "GIAI_THICH", columnDefinition = "nvarchar(max)")
	private String explain;
	@ManyToOne
	@JoinColumn(name = "MA_BAI_HOC", nullable = false)
	private Lesson lesson;
	@Column(name = "DAP_AN")
	private String answers;
	@OneToMany(mappedBy = "question")
	private List<TestContent> testContent;

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public List<TestContent> getTestContent() {
		return testContent;
	}

	public void setTestContent(List<TestContent> testContent) {
		this.testContent = testContent;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

}
