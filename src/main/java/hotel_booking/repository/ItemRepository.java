package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
