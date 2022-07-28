package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Price;

@Repository
public interface LessonRepository extends JpaRepository<Price, Integer> {
	Price findByLessonID(int lessonID);
	List<Price> findByChapter_ChapterID(int chapterID);

}
