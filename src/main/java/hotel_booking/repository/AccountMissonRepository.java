package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.compositeKey.AccountMissonKey;
import hotel_booking.entity.AccountMisson;

@Repository
public interface AccountMissonRepository extends JpaRepository<AccountMisson, AccountMissonKey> {

}
