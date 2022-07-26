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

import hotel_booking.compositeKey.TestContentKey;

@Entity
@Table(name = "NOI_DUNG_BAI_THI")
public class TestContent {

	@EmbeddedId
	private TestContentKey id;
	@ManyToOne
	@MapsId("testID")
	@JoinColumn(name = "MA_BAI_THI")
	private Test test;
	@ManyToOne
	@MapsId("questionID")
	@JoinColumn(name = "MA_CAU_HOI")
	private Question question;
	public TestContentKey getId() {
		return id;
	}
	public void setId(TestContentKey id) {
		this.id = id;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
