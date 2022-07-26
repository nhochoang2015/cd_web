package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.compositeKey.TestResultKey;
import hotel_booking.entity.TestResult;

@Repository
public interface TestResultRepository extends JpaRepository<TestResult, TestResultKey> {

}
