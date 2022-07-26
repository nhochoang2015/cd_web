package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
	@Query(value = "SELECT TOP 10 ca.* FROM CAU_HOI ca join BAI_HOC bh on ca.MA_BAI_HOC = bh.MA_BAI_HOC join CHUONG ch on bh.MA_CHUONG = ch.MA_CHUONG WHERE (bh.MA_CHUONG = ?1) ORDER BY NEWID()", nativeQuery = true)
	List<Question> findRandomQuestionByChapterID(int chapterID);
	Question findByQuestionID(int questionID);

}
