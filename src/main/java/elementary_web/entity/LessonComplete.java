package elementary_web.entity;

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

import elementary_web.entity.compositeKey.LessonCompleteKey;

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
}
