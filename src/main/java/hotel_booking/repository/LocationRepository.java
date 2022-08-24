package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{
	Location findByLocationID(int locationID);
	@Query(value = " SELECT * FROM DIA_DIEM WHERE TEN_DIA_DIEM LIKE '?1%' ",nativeQuery = true)
	List<Location> findByLocationName(String locationName);
	
	
	
	List<Location> findDistinctByLocationName(String locationName);

}
