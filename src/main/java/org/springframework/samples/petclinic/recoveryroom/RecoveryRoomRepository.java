package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom, Integer> {
	
	@Query("SELECT r FROM RecoveryRoomType r")  //TEST 2
	List<RecoveryRoomType> findAllRecoveryRoomTypes();  //TEST 2
	
    List<RecoveryRoom> findAll();  //TEST 2
    Optional<RecoveryRoom> findById(int id);  //TEST 2
    RecoveryRoom findByName(String name);  //TEST 2
    
    @Query("SELECT r FROM RecoveryRoomType r WHERE r.name=?1") //TEST 6
    RecoveryRoomType findRecoveryRoomType(String nombre);  //TEST 6
    
    @Query("SELECT r FROM RecoveryRoom r WHERE r.size<=?1")  //TEST 8
    List<RecoveryRoom> findBySizeMoreThan(Double size);  //TEST 8
    
    
    RecoveryRoom save(RecoveryRoom p);
    //RecoveryRoomType getRecoveryRoomType(String name);
    //List<RecoveryRoom> findBySizeMoreThan(double size);
}
