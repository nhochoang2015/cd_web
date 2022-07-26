package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

}
