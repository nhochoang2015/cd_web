package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.compositeKey.TestContentKey;
import hotel_booking.entity.TestContent;

@Repository
public interface TestContentRepository extends JpaRepository<TestContent, TestContentKey> {

}
