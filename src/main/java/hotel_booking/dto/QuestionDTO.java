package hotel_booking.dto;

public class QuestionDTO {

	private int questionID;

	private String content;

	private int lessonID;

	private String answers;
	private String explain;

	public QuestionDTO(int questionID, String content, int lessonID, String answers, String explain) {
		super();
		this.questionID = questionID;
		this.content = content;
		this.lessonID = lessonID;
		this.answers = answers;
		this.explain = explain;
	}

	public QuestionDTO(String content, int lessonID, String answers, String explain) {
		super();
		this.content = content;
		this.lessonID = lessonID;
		this.answers = answers;
		this.explain = explain;
	}

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

	public int getLessonID() {
		return lessonID;
	}

	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

}
