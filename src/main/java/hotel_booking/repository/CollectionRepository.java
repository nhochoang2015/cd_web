package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.compositeKey.CollectionKey;
import hotel_booking.entity.Collection;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, CollectionKey> {

}
