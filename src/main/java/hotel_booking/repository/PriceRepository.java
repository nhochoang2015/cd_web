package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
	Price findByPriceID(int priceID);


}
