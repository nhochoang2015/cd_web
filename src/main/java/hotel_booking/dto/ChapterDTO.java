package hotel_booking.dto;

import java.util.List;

public class ChapterDTO {

	private int chapterID;
	private String chapterName;
	private boolean active;
	private int subjectID;
	private List<LessonDTO> lessonList;
	private int score;

	public ChapterDTO(int chapterID, String chapterName, int subjectID, boolean active, List<LessonDTO> lessonList,
			int score) {
		super();
		this.chapterID = chapterID;
		this.chapterName = chapterName;
		this.subjectID = subjectID;
		this.active = active;
		this.lessonList = lessonList;
		this.score = score;
	}

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

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public List<LessonDTO> getLessonList() {
		return lessonList;
	}

	public void setLessonList(List<LessonDTO> lessonList) {
		this.lessonList = lessonList;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isChapterComplete(List<LessonCompleteDTO> userLessonCompleteList) {
		// Duyệt qua từng phần tử trong danh sách bài học của chương
		for (LessonDTO lesson : lessonList) {
			System.out.println("Chapter Lesson: " + lesson.getLessonID());
			// Kiểm tra xem danh sách bài học hoàn thành của người dùng có chương đó không
			boolean lessonIsComplete = false;
			for (LessonCompleteDTO lessonCompleteDTO : userLessonCompleteList) {
				if (lesson.getLessonID() == lessonCompleteDTO.getLessonID()) {
					lessonIsComplete = true;
					break;
				}
			}
			if (!lessonIsComplete)
				return false;

		}
		return true;

	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
