package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Chapter;
import hotel_booking.entity.Subject;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
	Chapter findByChapterID(int chapterID);
}
